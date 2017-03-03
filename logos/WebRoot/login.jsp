<%@ page language="java" import="java.util.*,com.pojo.*"  contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@include file="head.jsp"%>
<script type="text/javascript">
function shuaxin(obj) {
	var shijian = new Date().getTime();
	obj.src="loginAction.action?d="+shijian;
}

</script>
<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		<td height=25 valign=middle>
                  <img src="images/Forum_nav.gif" align="absmiddle">
                  <a href=index.jsp>电子商务门户</a> → 用户登录
                </td>
                </tr>
		</table>
              <br>

	<form action="login" method=post name="fooom">
		<table cellpadding=3 cellspacing=1 align=center class=tableborder1>
		<tr>
			<td valign=middle colspan=2 align=center height=25 background="images/bg2.gif" ></td>
		</tr>
		<tr>
		<td valign=middle class=tablebody1>请输入您的用户名</td>
			<td valign=middle class=tablebody1><INPUT id="username" name=username type=text> &nbsp;
				<a href="register.jsp">没有注册？</a>
			</td>
		</tr>
		<tr>
			<td valign=middle class=tablebody1>请输入您的密码 <font id="font1" color="red"></font></td>
			<td valign=middle class=tablebody1>
			<INPUT name=password type=password> &nbsp; </td>
			
		</tr><tr>
			<td valign=middle class=tablebody1>请输入您的验证码</td>
			<td valign=middle class=tablebody1>
			<INPUT name=val type=text> &nbsp; <img  alt="点击照片" src="loginAction" onclick="shuaxin(this)"></td>		
		</tr>
		<tr><!-- onclick="javascript:checkMe()" -->
			<td class=tablebody2 valign=middle colspan=2 align=center><input type=submit value="登 录" ></td>
		</tr>
		</table>
	</form>
	<%@include file= "foot.jsp"%>