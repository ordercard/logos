<%@ page language="java" import="java.util.*,com.pojo.*"  contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="/head.jsp"%>
<form method="post" name="reg" action="xgmm">
	<table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table1">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" background="../images/bg2.gif">
			<font color="#ffffff"><b>密码修改</b></font></td>
		</tr>

		<tr>
			<td width="40%" class="tablebody1"><b>用户名</b>：<br>
			注册用户名长度限制为0－16字节</td>
			<td width="60%" class="tablebody1">
			
			<input type="text" name="uss.username" maxLength="8" size="32" disabled value="${sessionScope.username }" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			<font color="#FF0000">*</font></td>
		</tr>
<tr>
			<td width="40%" class="tablebody1"><b>密码(至少6位，至多8位)</b>：<br>
			请输入密码，区分大小写。<br>
			请不要使用任何类似 \'*\'、\' \' 或 HTML 字符'
			</td>
		
			<td width="60%" class="tablebody1">
			<input type="password" maxLength="8" size="32" name="uss.password" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			<font color="#FF0000">*</font></td>
		</tr>
		
		<tr>
			<td width="40%" class="tablebody1"><b>密码(至少6位，至多8位)</b>：<br>
			请再输一遍确认</td>
			<td class="tablebody1">
			<input type="password" maxLength="8" size="32" name="uss.password2" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			<font color="#FF0000">*</font></td>
		</tr>
		
		<tr>
			<td class="tablebody2" valign="middle" colspan="2" align="center">
			<input type="submit" value="修 改" ></td>
		</tr>
	</table>
</form>
<%@include file="/foot.jsp" %>
