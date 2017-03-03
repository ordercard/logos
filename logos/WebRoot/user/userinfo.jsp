<%@ page language="java" import="java.util.*,com.pojo.*"  contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="/head.jsp"%>
<form method="post" name="reg" action="update">
	<table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table1">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" background="../images/bg2.gif">
			<font color="#ffffff"><b>用户信息修改</b></font></td>
		</tr>
	<tr>

			<input type="hidden" name="us.userid" value="${userlist[0].userid}">
			
		</tr>
		<tr>
			<td width="40%" class="tablebody1"><b>用户名</b>：<br>
			注册用户名长度限制为0－16字节</td>
			<td width="60%" class="tablebody1">
			
			<input type="text" name="us.username" maxLength="8" size="32" disabled value= "${userlist[0].username}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			<font color="#FF0000">*</font></td>
		</tr>

		<tr>
			<td class="tablebody1"><b>所在地区</b>：</td>
			<td class="tablebody1">
			<select name="country" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
				<option value="中国">中国</option>
				<option value="中国香港">中国香港</option>
				<option value="中国台湾">中国台湾</option>
			</select>
			<select name="province" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
                <option value="安徽" selected>安徽</option>

                <option value="北京" >北京</option>

                <option value="重庆" >重庆</option>

                <option value="福建" >福建</option>

                <option value="广东" >广东</option>

                <option value="甘肃" >甘肃</option>

                <option value="广西" >广西</option>

                <option value="贵州" >贵州</option>

                <option value="河南" >河南</option>

                <option value="湖北" >湖北</option>

                <option value="河北" >河北</option>

                <option value="海南" >海南</option>

                <option value="香港" >香港</option>

                <option value="黑龙江" >黑龙江</option>

                <option value="湖南" >湖南</option>

                <option value="吉林" >吉林</option>

                <option value="江苏" >江苏</option>

                <option value="江西" >江西</option>

                <option value="辽宁" >辽宁</option>

                <option value="澳门" >澳门</option>

                <option value="内蒙古" >内蒙古</option>

                <option value="宁夏" >宁夏</option>

                <option value="青海" >青海</option>

                <option value="四川" >四川</option>

                <option value="山东" >山东</option>

                <option value="上海" >上海</option>

                <option value="陕西" >陕西</option>

                <option value="山西" >山西</option>

                <option value="天津" >天津</option>

                <option value="台湾" >台湾</option>

                <option value="新疆" >新疆</option>

                <option value="西藏" >西藏</option>

                <option value="云南" >云南</option>

                <option value="浙江" >浙江</option>

                <option value="其它" >其它</option>
			</select>省
			<input type="text" size="8" name="us.city" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000" value="${userlist[0].city}">市/县</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>联系地址1</b>：</td>
			<td class="tablebody1">
			<input type="text" size="64" maxlength="32" name="us.street1" value="${userlist[0].street1}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>联系地址2</b>：</td>
			<td class="tablebody1">
			<input type="text" size="64" maxlength="32" name="us.street2" value="${userlist[0].street2}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>邮编</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="8" name="us.zip" value="${userlist[0].zip}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>家庭电话</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="16" name="us.homephone" value="${userlist[0].homephone}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>办公室电话</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="16" name="us.officephone" value="${userlist[0].officephone}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>手机</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="16" name="us.cellphone" value="${userlist[0].cellphone}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>Email地址</b>：<br>
			请输入有效的邮件地址</td>
			<td class="tablebody1">
			<input maxLength="50" size="32" maxlength="32" name="us.email" value="${userlist[0].email}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"></td>
		</tr>
		<tr>
			<td class="tablebody2" valign="middle" colspan="2" align="center">
			<input type="submit" value="修 改" ></td>
		</tr>
	</table>
</form>
<%@include file="/foot.jsp" %>