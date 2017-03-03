<%@ page language="java" import="java.util.*,com.pojo.*"
	contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
PageModel pg=(PageModel)request.getAttribute("pgproducts");
List lists=pg.getList();%>

<%@include file="head.jsp"%>

<!--文件体开始-->

<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
	<tr>
		<td height=25 valign=middle><img src="images/Forum_nav.gif"
			align="absmiddle"> <a href="Product_productAction">电子商务门户</a> →
			<img border="0" src="images/dog.gif" width="19" height="18"> 欢迎<font
			color="red"></font>光临！</td>
	</tr>
</table>
<br><%String searchname = (String)session.getAttribute("searchname"); %>
 <form action="Product_productSearchAction"  name="search"  method="post">
		<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		<td height=25 valign=middle align=right>
                  商品名称：<input type="text" name="productname"  value="<%=searchname %>"></input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <input type="submit" value="搜索" />
                </td>
                </tr>
		</table>
	</form>	
<form action="loginAction.do" method=post name="login">
	<table cellpadding=3 cellspacing=1 align=center class=tableborder1 >
		<tr>
			<td valign=middle align=center height=25 background="images/bg2.gif"
				width=""><font color="#ffffff"><b>序号</b></font></td>
			<td valign=middle align=center height=25 background="images/bg2.gif"
				width=""><font color="#ffffff"><b>商品名称</b></font></td>
			<td valign=middle align=center height=25 background="images/bg2.gif"
				width=""><font color="#ffffff"><b>价格</b></font></td>
			<td valign=middle align=center height=25 background="images/bg2.gif"
				width=""><font color="#ffffff"><b>操作</b></font></td>
		</tr>


		<%-- <s:iterator value="#lists"> 	--%>
		<% for(int i=0;i<lists.size();) {
			Product p=(Product)lists.get(i);
			%>
		<%if (i%4==0){ %>
		<tr>
			<%} %>

			<td id="td_bookall" class=tablebody1 valign=middle>&nbsp;&nbsp;
				<s:a href="Product_productDetailAction?productid=%{p.productid}">
					<img id="td_bookimg" alt="<s:property value="images"/>"
						src="<%=p.getImages()%>"/>
					<br />
					<br />
					<%=p.getName()%></s:a> &nbsp;&nbsp; <span id="td_price"><%=p.getBaseprice()%></span><br />
			<br /> <s:a href="Cart_addAction?productid=%{productid}">
					<img id="td_addimg" border="0" src="images/car_new.gif" width="97"
						height="18">
				</s:a> <br />
			<br />
			</td>

			<% i++; %>
			<%if (i%4==0){ %>
		</tr>
		<%} %>

		<%   }  %>
		<%-- </s:iterator>  --%>

	</table>
	<br>
	<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
			<td height=25 valign=middle align=middle><a href="productfagefenye?id=<%=pg.getPageNo()-1%>">[上一页]</a>&nbsp;&nbsp;&nbsp;<font
				style="color:red">1</font>&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;...&nbsp;&nbsp;&nbsp;<a
				href="productfagefenye?id=<%=pg.getPageNo()+1%>">[下一页]</a></td>
		</tr>
	</table>
</form>
<%@include file="foot.jsp"%>

