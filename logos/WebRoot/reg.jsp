<%@ page language="java" import="java.util.*,com.pojo.*"  contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<<script type="text/javascript">
<!--
function check(){
			//alert("开始和服务器通信来判断用户名是否存在");
			$.ajax({
			   	type: "POST",
			   	url: "ajax",
			   	data: "username="+$("#username").val(),
			   	success: function(msg){
					//alert(msg);//0
					if(msg==0){
						//把用户名可用这句话放到font标签中
						$("#font1").html("用户名可用");
						$("#username").text("用户名被使用");
						//document.getElementById("font1").innerHtml = "用户名可用";
						
					}else{
						//把用户名已存在这句话放到font标签中
						$("#font1").html("用户名已存在");
					}

				}
			
			});
		}
	





//-->
</script>

  <%@ include file="head.jsp" %>
<!--文件体开始-->

		<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		<td height=25 valign=middle>
                  <img src="images/Forum_nav.gif" align="absmiddle">
                  <a href=index.jsp>电子商务门户</a> → 用户注册
                </td>
                </tr>
		</table>
              <br>

<form method="post" name="reg" action="registerAction">
	<table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table1">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" background="images/bg2.gif">
			<font color="#ffffff"><b>新用户注册</b></font></td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1"><b>用户名</b>：<br>
			注册用户名长度限制为0－16字节</td>
			<td width="60%" class="tablebody1">
			<input id="username" maxLength="8" size="32" name="u.username"  style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000" onBlur="check()">
			<font id="font1" color="red"></font> <font color="#FF0000">*</font></td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1"><b>密码(至少6位，至多8位)</b>：<br>
			请输入密码，区分大小写。<br>
			请不要使用任何类似 \'*\'、\' \' 或 HTML 字符'
			</td>
			<td width="60%" class="tablebody1">
			<input type="password" maxLength="8" size="32" name="u.password" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			<font color="#FF0000">*</font></td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1"><b>密码(至少6位，至多8位)</b>：<br>
			请再输一遍确认</td>
			<td class="tablebody1">
			<input type="password" maxLength="8" size="32" name="u.password2" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			<font color="#FF0000">*</font></td>
		</tr>
		<tr>
			<td class="tablebody1"><b>所在地区</b>：</td>
			<td class="tablebody1">
			<select name="country" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
				<option value="">中国</option>
				<option value="">中国香港</option>
				<option value="">中国台湾</option>
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
			<input type="text" size="8" name="u.city" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">市/县</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>联系地址1</b>：</td>
			<td class="tablebody1">
			<input type="text" size="64" maxlength="32" name="u.street1" >
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>联系地址2</b>：</td>
			<td class="tablebody1">
			<input type="text" size="64" maxlength="32" name="u.street2" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>邮编</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="8" name="u.zip" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>家庭电话</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="16" name="u.homephone" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>办公室电话</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="16" name="u.officephone" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>手机</b>：</td>
			<td class="tablebody1">
			<input type="text" size="32" maxlength="16" name="u.cellphone" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody1"><b>Email地址</b>：<br>
			请输入有效的邮件地址</td>
			<td class="tablebody1">
			<input maxLength="50" size="32" maxlength="32" name="u.email" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"></td>
		</tr>
		<tr>
			<td class="tablebody2" valign="middle" colspan="2" align="center"><!-- onclick="javascript:checkReg() -->
			<input type="submit" value="注 册" ">&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="清 除"></td>
		</tr>
	</table>
</form>
<!--文件尾开始-->
	<%@ include file="foot.jsp"%>

