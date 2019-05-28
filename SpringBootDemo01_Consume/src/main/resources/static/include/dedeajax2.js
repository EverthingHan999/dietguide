<!--

var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "../../hm.baidu.com/hm.js-75d0e185b9c0f75227fbb485dfb865a1"/*tpa=https://hm.baidu.com/hm.js?75d0e185b9c0f75227fbb485dfb865a1*/;
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();

//置顶开始
document.write("<a id='rtt'></a>");
function myEvent(obj,ev,fn){
	if(obj.attachEvent){
		obj.attachEvent('on'+ev,fn);
	}else{
		obj.addEventListener(ev,fn,false);
	}
}
myEvent(window,'load',function(){
	var oRTT=document.getElementById('rtt');
	var pH=document.documentElement.clientHeight;
	var timer=null;
	var scrollTop;
	window.onscroll=function(){
		scrollTop=document.documentElement.scrollTop||document.body.scrollTop;
		if(scrollTop>=pH){
			oRTT.style.display='block';
		}else{
			oRTT.style.display='none';
		}
		return scrollTop;
	};
	oRTT.onclick=function(){
		clearInterval(timer);
		timer=setInterval(function(){
			var now=scrollTop;
			var speed=(0-now)/10;
			speed=speed>0?Math.ceil(speed):Math.floor(speed);
			if(scrollTop==0){
				clearInterval(timer);
			}
			document.documentElement.scrollTop=scrollTop+speed;
			document.body.scrollTop=scrollTop+speed;
		}, 10);
	}
});
//置顶结束

//xmlhttp和xmldom对象
var DedeXHTTP = null;
var DedeXDOM = null;
var DedeContainer = null;
var DedeShowError = false;
var DedeShowWait = false;
var DedeErrCon = "";
var DedeErrDisplay = "下载数据失败";
var DedeWaitDisplay = "正在下载数据...";

//获取指定ID的元素

function $DE(id) {
    return document.getElementById(id);
}

//gcontainer 是保存下载完成的内容的容器
//mShowError 是否提示错误信息
//DedeShowWait 是否提示等待信息
//mErrCon 服务器返回什么字符串视为错误
//mErrDisplay 发生错误时显示的信息
//mWaitDisplay 等待时提示信息
//默认调用 DedeAjax('divid',false,false,'','','')

function DedeAjax(gcontainer,mShowError,mShowWait,mErrCon,mErrDisplay,mWaitDisplay)
{

    DedeContainer = gcontainer;
    DedeShowError = mShowError;
    DedeShowWait = mShowWait;
    if(mErrCon!="") DedeErrCon = mErrCon;
    if(mErrDisplay!="") DedeErrDisplay = mErrDisplay;
    if(mErrDisplay=="x") DedeErrDisplay = "";
    if(mWaitDisplay!="") DedeWaitDisplay = mWaitDisplay;


    //post或get发送数据的键值对
    this.keys = Array();
    this.values = Array();
    this.keyCount = -1;
    this.sendlang = 'gb2312';

    //请求头类型
    this.rtype = 'text';

    //初始化xmlhttp
    //IE6、IE5
    if(window.ActiveXObject) {
        try { DedeXHTTP = new ActiveXObject("Msxml2.XMLHTTP");} catch (e) { }
        if (DedeXHTTP == null) try { DedeXHTTP = new ActiveXObject("Microsoft.XMLHTTP");} catch (e) { }
    }
    else {
        DedeXHTTP = new XMLHttpRequest();
    }

    //增加一个POST或GET键值对
    this.AddKeyN = function(skey,svalue) {
        if(this.sendlang=='utf-8') this.AddKeyUtf8(skey, svalue);
        else this.AddKey(skey, svalue);
    };
    
    this.AddKey = function(skey,svalue) {
        this.keyCount++;
        this.keys[this.keyCount] = skey;
        svalue = svalue+'';
        if(svalue != '') svalue = svalue.replace(/\+/g,'$#$');
        this.values[this.keyCount] = escape(svalue);
    };

    //增加一个POST或GET键值对
    this.AddKeyUtf8 = function(skey,svalue) {
        this.keyCount++;
        this.keys[this.keyCount] = skey;
        svalue = svalue+'';
        if(svalue != '') svalue = svalue.replace(/\+/g,'$#$');
        this.values[this.keyCount] = encodeURI(svalue);
    };

    //增加一个Http请求头键值对
    this.AddHead = function(skey,svalue) {
        this.rkeyCount++;
        this.rkeys[this.rkeyCount] = skey;
        this.rvalues[this.rkeyCount] = svalue;
    };

    //清除当前对象的哈希表参数
    this.ClearSet = function() {
        this.keyCount = -1;
        this.keys = Array();
        this.values = Array();
        this.rkeyCount = -1;
        this.rkeys = Array();
        this.rvalues = Array();
    };


    DedeXHTTP.onreadystatechange = function() {
        //在IE6中不管阻断或异步模式都会执行这个事件的
        if(DedeXHTTP.readyState == 4){
            if(DedeXHTTP.status == 200)
            {
                if(DedeXHTTP.responseText!=DedeErrCon) {
                    DedeContainer.innerHTML = DedeXHTTP.responseText;
                }
                else {
                    if(DedeShowError) DedeContainer.innerHTML = DedeErrDisplay;
                }
                DedeXHTTP = null;
            }
            else { if(DedeShowError) DedeContainer.innerHTML = DedeErrDisplay; }
        }
        else { if(DedeShowWait) DedeContainer.innerHTML = DedeWaitDisplay; }
    };

    //检测阻断模式的状态
    this.BarrageStat = function() {
        if(DedeXHTTP==null) return;
        if(typeof(DedeXHTTP.status)!=undefined && DedeXHTTP.status == 200)
        {
            if(DedeXHTTP.responseText!=DedeErrCon) {
                DedeContainer.innerHTML = DedeXHTTP.responseText;
            }
            else {
                if(DedeShowError) DedeContainer.innerHTML = DedeErrDisplay;
            }
        }
    };

    //发送http请求头
    this.SendHead = function()
    {
        //发送用户自行设定的请求头
        if(this.rkeyCount!=-1)
        { 
            for(var i = 0;i<=this.rkeyCount;i++)
            {
                DedeXHTTP.setRequestHeader(this.rkeys[i],this.rvalues[i]);
            }
        }
        　if(this.rtype=='binary'){
        　DedeXHTTP.setRequestHeader("Content-Type","multipart/form-data");
    }else{
        DedeXHTTP.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    }
};

//用Post方式发送数据
this.SendPost = function(purl) {
    var pdata = "";
    var i=0;
    this.state = 0;
    DedeXHTTP.open("POST", purl, true);
    this.SendHead();
    //post数据
    if(this.keyCount!=-1)
    {
        for(;i<=this.keyCount;i++)
        {
            if(pdata=="") pdata = this.keys[i]+'='+this.values[i];
            else pdata += "&"+this.keys[i]+'='+this.values[i];
        }
    }
    DedeXHTTP.send(pdata);
};

//用GET方式发送数据
this.SendGet = function(purl) {
    var gkey = "";
    var i=0;
    this.state = 0;
    //get参数
    if(this.keyCount!=-1)
    { 
        for(;i<=this.keyCount;i++)
        {
            if(gkey=="") gkey = this.keys[i]+'='+this.values[i];
            else gkey += "&"+this.keys[i]+'='+this.values[i];
        }
        if(purl.indexOf('?')==-1) purl = purl + '?' + gkey;
        else  purl = purl + '&' + gkey;
    }
    DedeXHTTP.open("GET", purl, true);
    this.SendHead();
    DedeXHTTP.send(null);
};

//用GET方式发送数据，阻塞模式
this.SendGet2 = function(purl) {
    var gkey = "";
    var i=0;
    this.state = 0;
    //get参数
    if(this.keyCount!=-1)
    { 
        for(;i<=this.keyCount;i++)
        {
            if(gkey=="") gkey = this.keys[i]+'='+this.values[i];
            else gkey += "&"+this.keys[i]+'='+this.values[i];
        }
        if(purl.indexOf('?')==-1) purl = purl + '?' + gkey;
        else  purl = purl + '&' + gkey;
    }
    DedeXHTTP.open("GET", purl, false);
    this.SendHead();
    DedeXHTTP.send(null);
    //firefox中直接检测XHTTP状态
    this.BarrageStat();
};

//用Post方式发送数据
this.SendPost2 = function(purl) {
    var pdata = "";
    var i=0;
    this.state = 0;
    DedeXHTTP.open("POST", purl, false);
    this.SendHead();
    //post数据
    if(this.keyCount!=-1)
    {
        for(;i<=this.keyCount;i++)
        {
            if(pdata=="") pdata = this.keys[i]+'='+this.values[i];
            else pdata += "&"+this.keys[i]+'='+this.values[i];
        }
    }
    DedeXHTTP.send(pdata);
    //firefox中直接检测XHTTP状态
    this.BarrageStat();
};


} // End Class DedeAjax

//初始化xmldom
function InitXDom() {
    if(DedeXDOM!=null) return;
    var obj = null;
    // Gecko、Mozilla、Firefox
    if (typeof(DOMParser) != "undefined") { 
        var parser = new DOMParser();
        obj = parser.parseFromString(xmlText, "text/xml");
    }
    // IE
    else { 
        try { obj = new ActiveXObject("MSXML2.DOMDocument");} catch (e) { }
        if (obj == null) try { obj = new ActiveXObject("Microsoft.XMLDOM"); } catch (e) { }
    }
    DedeXDOM = obj;
};



//读写cookie函数
function GetCookie(c_name)
{
    if (document.cookie.length > 0)
    {
        c_start = document.cookie.indexOf(c_name + "=")
        if (c_start != -1)
        {
            c_start = c_start + c_name.length + 1;
            c_end   = document.cookie.indexOf(";",c_start);
            if (c_end == -1)
            {
                c_end = document.cookie.length;
            }
            return unescape(document.cookie.substring(c_start,c_end));
        }
    }
    return null
}

function SetCookie(c_name,value,expiredays)
{
    var exdate = new Date();
    exdate.setDate(exdate.getDate() + expiredays);
    document.cookie = c_name + "=" +escape(value) + ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString()); //使设置的有效时间正确。增加toGMTString()
}


function CheckLogin(id){
	  var taget_obj = document.getElementById('_ajax_feedback');
	  myajax = new DedeAjax(taget_obj,false,false,'','','');
	  myajax.SendGet2("/member/ajax_feedback.php?id="+id);
	  DedeXHTTP = null;
}

function postDigg(ftype,aid)
{
	var taget_obj = document.getElementById('newdigg'+aid);
	myajax = new DedeAjax(taget_obj,false,false,'','','');
	var url = "/plus/digg_ajax2.php?action="+ftype+"&id="+aid;
	myajax.SendGet2(url);
}
function getDigg(aid)
{
	var taget_obj = document.getElementById('newdigg'+aid);
	myajax = new DedeAjax(taget_obj,false,false,'','','');
	myajax.SendGet2("/plus/digg_ajax2.php?id="+aid);
	DedeXHTTP = null;
}


function postxihuan(ftype,aid)
{
	var taget_obj = document.getElementById('newxihuan'+aid);
	myajax = new DedeAjax(taget_obj,false,false,'','','');
	var url = "/plus/xihuan.php?action="+ftype+"&id="+aid;
	myajax.SendGet2(url);
}
function getxihuan(aid)
{
	var taget_obj = document.getElementById('newxihuan'+aid);
	myajax = new DedeAjax(taget_obj,false,false,'','','');
	myajax.SendGet2("/plus/xihuan.php?id="+aid);
	DedeXHTTP = null;
}


function postBadGood(ftype,fid)
{
	var taget_obj = document.getElementById(ftype+fid);
	var saveid = GetCookie('badgoodid');
	if(saveid != null)
	{
		var saveids = saveid.split(',');
		var hasid = false;
		saveid = '';
		j = 1;
		for(i=saveids.length-1;i>=0;i--)
		{
			if(saveids[i]==fid && hasid) continue;
			else {
				if(saveids[i]==fid && !hasid) hasid = true;
				saveid += (saveid=='' ? saveids[i] : ','+saveids[i]);
				j++;
				if(j==10 && hasid) break;
				if(j==9 && !hasid) break;
			}
		}
		if(hasid) { alert('只能支持一次哦！'); return false;}
		else saveid += ','+fid;
		SetCookie('badgoodid',saveid,1);
	}
	else
	{
		SetCookie('badgoodid',fid,1);
	}
	myajax = new DedeAjax(taget_obj,false,false,'','','');
	myajax.SendGet2("/plus/feedback.php?aid="+fid+"&action="+ftype+"&fid="+fid);
}


	function CheckLogina(){
	  var taget_obj = document.getElementById('userlogin');
	  myajax = new DedeAjax(taget_obj,false,false,'','','');
	  myajax.SendGet2("http://www.yinshiweb.com/member/ajax_loginsta.php");
	  DedeXHTTP = null;
	}

function denglu()
{
var urlb=window.location.href; 
window.location.href="http://www.yinshiweb.com/member/index.php?urlb="+urlb;
}
function sinad()
{
var urlb=window.location.href; 
window.location.href="http://www.yinshiweb.com/member/xinlang/index.php?xlurl="+urlb;
}
function qqd()
{
var urlb=window.location.href; 
window.location.href="http://www.yinshiweb.com/member/qq/index.php?qlurl="+urlb;
}


ad300="<div class=\"ad\">\r\n<script async src=\"../../pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"/*tpa=http://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js*/></script>\r\n<!-- 300 -->\r\n<ins class=\"adsbygoogle\"\r\n     style=\"display:inline-block;width:300px;height:250px\"\r\n     data-ad-client=\"ca-pub-5372870298973856\"\r\n     data-ad-slot=\"7622284797\"></ins>\r\n<script>\r\n(adsbygoogle = window.adsbygoogle || []).push({});\r\n</script>\r\n\r\n   </div>";

ad970="<div class=\"hengfuc\">\r\n<script async src=\"../../pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"/*tpa=http://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js*/></script>\r\n<!-- 970-90 -->\r\n<ins class=\"adsbygoogle\"\r\n     style=\"display:inline-block;width:970px;height:90px\"\r\n     data-ad-client=\"ca-pub-5372870298973856\"\r\n     data-ad-slot=\"7772251199\"></ins>\r\n<script>\r\n(adsbygoogle = window.adsbygoogle || []).push({});\r\n</script>\r\n</div>\r\n\r\n"

baidu300tu="<div class=\"ad\"><script type=\"text/javascript\" src=\"http://tuijian.yinshiweb.com/site/js/production/qqt54.js?ezoh=hahyh\"></script> </div>";

baidu300wen="<div class=\"ad\"><script type=\"text/javascript\" src=\"http://tuijian.yinshiweb.com/site/6zy5.js?xsh=aataub\"></script> </div>";

neiwens="<script type=\"text/javascript\">\r\n    /*自适应 创建于 2018/3/6*/\r\n    var cpro_id = \"u3377123\";\r\n</script>\r\n<script type=\"text/javascript\" src=\"../../cpro.baidustatic.com/cpro/ui/cnw.js\"/*tpa=http://cpro.baidustatic.com/cpro/ui/cnw.js*/></script>";

baidu300x400="<div class=\"ad\"><script type=\"text/javascript\" src=\"http://tuijian.yinshiweb.com/source/e8qz.js?v=qiwfpwzp\"></script> </div>";

baiduneiwen="<div class=\"ad\">\r\n<!-- cpu feeds block -->\r\n<div class=\"cpu-feeds-block\" data-site-id=\"271692216\" data-block-id=\"4451\"></div>\r\n<script>\r\n(function(){var url=\"http://cpu.baidu.com/\";var getEntry=function(){var script=document.createElement(\"script\");script.id=\"cpu-block-entry\";script.src=url+\"/js/cb_pc.js\";var scriptTag=document.getElementsByTagName(\"script\")[0];scriptTag.parentNode.insertBefore(script,scriptTag)};var sentMsg=function(e){var msg={msg:e.toString()||\"no err msg\",line:e.lineno||-1};var img=document.createElement(\"img\");if(JSON){msg=encodeURIComponent(JSON.stringify(msg))}else{msg=\"&line=\"+msg.line+\"&msg=\"+msg.msg}img.src=url+\"/msg?m=block&e=\"+msg};try{window.feedsbycpu=window.feedsbycpu||[];window.feedsbycpu.push({siteId:\"271692216\",blockId:\"4451\",display:\"auto\"});document.getElementById(\"cpu-block-entry\")||getEntry()}catch(e){sentMsg(e)}})();\r\n</script>\r\n<!-- cpu feeds block end-->\r\n</div>";


baidu630="<div class=\"adbottom\"><script type=\"text/javascript\" src=\"http://tuijian.yinshiweb.com/source/common/resource/mqfce9.js?bwocf=ltoe\"></script></div>";

baidu630tu="<div class=\"adbottom\"><script type=\"text/javascript\">\r\n    /*630*130 创建于 2017/7/25*/\r\n    var cpro_id = \"u3043354\";\r\n</script>\r\n<script type=\"text/javascript\" src=\"../../cpro.baidustatic.com/cpro/ui/c.js\"/*tpa=http://cpro.baidustatic.com/cpro/ui/c.js*/></script></div>";


baidu970="<div class=\"hengfuc\"><script type=\"text/javascript\" src=\"http://tuijian.yinshiweb.com/common/openjs/web/flfz.js?rmbu=uuvus\"></script></div>"

baidu9701="<div class=\"hengfuc\">\r\n<script type=\"text/javascript\">\r\n     /*970*92 创建于 2017/7/25*/\r\n    var cpro_id = \"u3043717\";\r\n</script>\r\n<script type=\"text/javascript\" src=\"../../cpro.baidustatic.com/cpro/ui/c.js\"/*tpa=http://cpro.baidustatic.com/cpro/ui/c.js*/></script>\r\n</div>"



function h9703()  {
document.write(baidu970);
}

function h9702(baidu970)  {

}

function h9701()  {
document.write(ad970);
}

function h630c() {}
function h630()  {
document.write(baidu630);
}
function h631()  {
document.write();
}
function h632()  {

}

function h3001()  {
document.write(baidu300tu);
}
function h3002()  {
document.write(baidu300wen);
}
function h3003()  {
document.write();
}
function h3004()  {
document.write();
}
      
-->
