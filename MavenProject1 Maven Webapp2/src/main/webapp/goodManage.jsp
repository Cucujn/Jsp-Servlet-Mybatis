<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.cjn.entity.Good"%>
<%@page import="com.cjn.entity.Type"%>
<%@page import="com.cjn.service.GoodService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品管理界面</title>
</head>
<body>
	<%
		GoodService goodService = new GoodService();
		List<Good> goods = goodService.selectGoods();
	%>
	<center>
		<h1>商品管理界面</h1>
		<h5><a href="login.jsp">退出登录</a></h5>
		<h5><a href="showFunction.jsp">返回主页面</a></h5>
	</center>
	<table border="1" bordercolor="black" align="center" width="700">
		<tr>
			<th>商品ID</th>
			<th>商品名称</th>
			<th>商品价格</th>
			<th>商品库存</th>
		</tr>
		<%
			for (Good good : goods) {
		%>
		<%
			out.print("<tr>");
				out.print("<td>" + good.getGoodId() + "</td>");
				out.print("<td>" + good.getGoodName() + "</td>");
				out.print("<td>" + good.getGoodPrice() + "</td>");
				//out.print("<td>"+good.getGoodType().getTypeName()+"</td>");
				out.print("<td>" + good.getGoodStore() + "</td>");
				out.print("</tr>");
		%>
		<%
			}
		%>
		<tr>
			<td><a href="goodUpdate.jsp">更新商品</a></td>
			<td><a href="goodDelete.jsp">删除商品</a></td>
			<td><a href="goodAdd.jsp">添加商品</a></td>
	</table>

</body>
</html>