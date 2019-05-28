function LoadCommets(id,page)
{
		var taget_obj = document.getElementById('commetcontent');
		var waithtml = "<div style='line-height:50px'>评论加载中...</div>";
		var myajax = new DedeAjax(taget_obj, true, true, '', 'x', waithtml);
		myajax.SendGet2("/plus/feedback_ajax1.php?dopost=getlist&aid="+id+"&page="+page);
		DedeXHTTP = null;
}
function PostComment(cid)
{
		var f = document.feedback;
		var nface = '6';
		var nfeedbacktype = 'feedback';
		var nvalidate = '';
		var nnotuser = '';
		var nusername = '';
		var npwd = '';
		var taget_obj = $DE('commetcontentNew');
		var waithtml = "<div style='line-height:30px'>正在发送中...</div>";
		if(f.msg.value=='')
		{
			alert("内容不能为空！");
			return;
		}
		if(f.validate)
		{
			if(f.validate.value=='') {
				alert("请填写验证码！");
				return;
			}
			else {
				nvalidate = f.validate.value;
			}
		}
		if(f.msg.value.length > 500)
		{
			alert("你的评论是不是太长了？请填写500字以内的评论。");
			return;
		}
		if(f.feedbacktype) {
			for(var i=0; i < f.feedbacktype.length; i++)
				if(f.feedbacktype[i].checked) nfeedbacktype = f.feedbacktype[i].value;
		}
		if(f.face) {
			for(var j=0; j < f.face.length; j++)
				if(f.face[j].checked) nface = f.face[j].value;
		}
		if(f.notuser.checked) nnotuser = '1';
		if(f.username) nusername = f.username.value;
		if(f.pwd) npwd = f.pwd.value;
		
		var myajax = new DedeAjax(taget_obj, false, true, '', '', waithtml);
		myajax.sendlang = 'gb2312';
		myajax.AddKeyN('dopost', 'send');
		myajax.AddKeyN('aid', cid);
		myajax.AddKeyN('fid', f.fid.value);
		myajax.AddKeyN('face', nface);
		myajax.AddKeyN('feedbacktype', nfeedbacktype);
		myajax.AddKeyN('validate', nvalidate);
		myajax.AddKeyN('notuser', nnotuser);
		myajax.AddKeyN('username', nusername);
		myajax.AddKeyN('pwd', npwd);
		myajax.AddKeyN('msg', f.msg.value);
		myajax.SendPost2('http://www.yinshiweb.com/plus/feedback_ajax.php');
		f.msg.value = '';
		f.fid.value = 0;
		if(f.validate)
		{
			if($DE('validateimg')) $DE('validateimg').src = "/include/vdimgck.php?"+f.validate.value;
			f.validate.value = '';
		}
}
function quoteCommet(fid)
{
	document.feedback.fid.value = fid;
}


//cpic=document.getElementById("fengmian").getElementsByTagName("img")[0].src;
//if(cpic=="") {
 cpic=document.getElementById("fengmian").getElementsByTagName("img")[0];
cpic=cpic.getAttribute("data-original");
cpic="http://www.yinshiweb.com"+cpic;
//}

window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":["qzone","tsina","bdysc","weixin","douban","bdhome"],"bdPic":cpic,"bdStyle":"0","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];

	var fenx=document.getElementById("fenxiang");
	fenx.onmouseover=function() {
	document.getElementById("fenxiangbox").style.display="block";
	}
	fenx.onmouseout=function() {
	document.getElementById("fenxiangbox").style.display="none";
	}
var xiang=document.getElementById("xiangguanyuedu");
 var a = xiang.getElementsByTagName("a");
    if(!a.length>0){
document.getElementById("xiangguanyuedu").style.display="none";
}

