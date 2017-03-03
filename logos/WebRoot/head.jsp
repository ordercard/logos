<%@ page language="java" import="java.util.*,com.pojo.*"  contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="description" content="电子商务门户">
		<title>电子商务门户</title>
		<LINK href="css/test.css" rel=stylesheet>
		<script language = "JavaScript" src = "js/test.js"></script>
		<style>
			#td_bookall{
				text-align:center;
				height:100px;
				width:24%;
			}
			#td_bookimg{
				width:130px;
				height:200px;
			}
			#td_price{
				color:red;
			}
			.tableborder1 {
	background: white;
}
		</style>
		<script src="js/jquery-3.1.1.js"></script>
	</head>
	<body onLoad="MM_preloadImages('images/index_on.gif','images/reg_on.gif','images/order_on.gif','../images/top/topxmas/jp_on.gif','../images/top/topxmas/download_on.gif','../images/top/topxmas/bbs_on.gif','../images/top/topxmas/designwz_on.gif')" topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" id="table2">
		  <tr>
		    <td align="left" width="7%" background="images/top_bg.gif"><img src="images/logo.gif" width="286" height="58"></td>
		    <td width="62%" background="images/top_bg.gif">　</td>
		    <td width="31%" background="images/top_r.gif" align="right" style="width: 284px; ">
		    
		   <center>
		   <%
		      String username =(String)session.getAttribute("username");
		      if(username!=null){
		       %>

	<font color="red">欢迎  ${username}登录成功</font>
<script language="JavaScript">
<!--
var mess="";
document.write("<center><b>")
day = new Date( )
hr = day.getHours( )
if (( hr >= 0 ) && (hr <= 4 ))
mess="深夜了，注意身体哦... "
if (( hr >= 4 ) && (hr < 7))
mess="清晨好，起得真早啊... "
if (( hr >= 7 ) && (hr < 12))
mess="早上好，女士们，先生们！"
if (( hr >= 12) && (hr <= 13))
mess="午饭时间，别太为难自己的肚子哦！"
if (( hr >= 13) && (hr <= 17))b
mess="外面的太阳猛烈吗？还是呆在家里舒服吧？ "
if (( hr >= 17) && (hr <= 18))
mess="进入傍晚了，不想去散散步吗？"
if ((hr >= 18) && (hr <= 19))
mess="我大概在吃晚饭了，你呢？"
if ((hr >= 19) && (hr <= 23))
mess="又到晚上黄金上网时间了，你还等什么？"
document.write(mess)
document.write("</b></center>")
//--->
</script>
   </center> 

<a href="userinfo">修改个人资料</a><a href="xiugai">修改密码</a><a href="">退出</a>
		
		      <%
		      }      
		      else{
		       %>
     
			<a href="login.jsp">[登录]</a>
			<a href="reg.jsp">[注册]</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		 ur    <%
		      
		      }
  
		     %>
		    </td>

		  </tr>
		</table>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		    <td background="images/dh_bg.gif" align="left" height="12">
		      <table width="100" border="0" cellspacing="0" cellpadding="0" align="center">
		        <tr>
		          <td width="5%">　</td>
		          <td width="10%"><a href="productfagefenye" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image1','','images/index_on.gif',1)">
					<img name="Image1" border="0" src="images/index.gif" width="90" height="36"></a></td>
		          <td width="10%"><a href="#" onMouseOut="MM_swapImgRestore()"  onMouseOver="MM_swapImage('Image2','','images/reg_on.gif',1)" >
					<img name="Image2" border="0" src="images/reg.gif" width="92" height="36"></a></td>
		          <td width="10%"><a href="shopcart.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image4','','images/carts_on.gif',1)">
					<img name="Image4" border="0" src="images/cart.gif" width="92" height="36"></a></td>
		          <td width="10%"><a href="user/order.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image5','','images/order_on.gif',1)">
					<img name="Image5" border="0" src="images/order.gif" width="92" height="36"></a></td>
		          <td width="10%"><a href="userexit" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image6','','images/exit_on.gif',1)">
					<img name="Image6" border="0" src="images/exit.gif" width="92" height="36"></a></td>
		        </tr>
		      </table>
		    </td>
		  </tr>
		</table>
		<table cellspacing="1" cellpadding="3" align="center" border="0" width="98%">
		<tr>
		<td width="65%"><BR>
		>> 欢迎访问 <b>电子商务门户</b> </td>
		<td width="35%" align="right">

		</td></tr>
		</table>


