/* 
 * http://www.yinshiweb.com/ by 梵高的耳朵
 * 12-12-09
*/
jQuery(function ($) {
  var enableSticky, stickyTag, stickyTagWrapper, main, side, stickyStartHeight, stickyEndHeight, stickyHeight, MARGIN_TOP, MARGIN_BOTTOM, WINDOW_MIN_HEIGHT;
  if (!$.support.style && (typeof document.documentElement.style.maxHeight == "undefined")) return; // IE6 check
  stickyTag = $('#flow_div');
  stickyTagWrapper = $('#left_main');
  main = $('#leftbox');
  side = $('#rightBox');
  MARGIN_TOP = 18; 
  MARGIN_BOTTOM = 3;
  WINDOW_MIN_HEIGHT = 520; 
  if (!stickyTagWrapper || !stickyTag.length || !main.length || !side.length) return;
  stickyTag.css("position", "static");
  var updateParams = function(){
    stickyStartHeight = stickyTagWrapper.position().top - MARGIN_TOP;
    var mainBottom = main.position().top + main.height();
    stickyEndHeight = mainBottom - stickyTag.height() - MARGIN_BOTTOM;

    checkEnv();
  };
  var checkEnv = function(){
    enableSticky = (main.height() > side.height()) && ($(window).height() > stickyTag.height() || $(window).height() > WINDOW_MIN_HEIGHT);
    if ($("#flow_div .x4_height").length || ($("#flow_div .x2_height").length && $("#tieup_list_content ul").length)) {
      enableSticky = false;
    }
  };
  var updatePosition = function(){
    if (enableSticky) {
      var currentScrollTop = window.pageYOffset || document.documentElement.scrollTop;
      if (currentScrollTop <= stickyStartHeight) {
        if (stickyTag.css("position") !== "static") {
          stickyTag.css("position", "static").css("top", "");
        }
      }
// else if (currentScrollTop< stickyEndHeight) {  下面的加了顶上的margin

 else if (currentScrollTop+MARGIN_TOP < stickyEndHeight) {
        if (stickyTag.css("position") !== "fixed") {
          stickyTag.css("position", "fixed").css("top", MARGIN_TOP + "px");  
        }
      } else {
        if (stickyTag.css("position") !== "absolute") {
          stickyTag.css("position", "absolute").css("top", stickyEndHeight + "px");
        }
      }
    } else {
      if (stickyTag.css("position") !== "static") {
        stickyTag.css("position", "static").css("top", "");
      }
    }
  };
  updateParams();
  updatePosition();
  $("#mainContent, #rightBox").bind("ajaxComplete", function(){
    updateParams(); 
    updatePosition();
  });
  $(window).bind("load", function(){
    updateParams();
    updatePosition();
  });
  $(window).bind("resize", function(){
    checkEnv();
  })
  $(window).bind("scroll", function(){
    updatePosition();
  });
});

