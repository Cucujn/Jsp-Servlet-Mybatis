<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.cjn.entity.Type"%>
<%@page import="com.cjn.entity.Type"%>
<%@page import="com.cjn.service.TypeService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品种类管理界面</title>
</head>
<body>
	<%
		TypeService typeService = new TypeService();
		List<Type> types = typeService.selectTypes();
	%>
	<center>
		<h1>商品管理界面</h1>
		<h5>
			<a href="login.jsp">退出登录</a>
		</h5>
		<h5>
			<a href="showFunction.jsp">返回主页面</a>
		</h5>
	</center>
	<table border="1" bordercolor="black" align="center" width="700">
		<tr>
			<th>商品种类ID</th>
			<th>商品种类 名称</th>
		</tr>
		<%
			for (Type type : types) {
		%>
		<%
			out.print("<tr>");
				out.print("<td>" + type.getTypeId() + "</td>");
				out.print("<td>" + type.getTypeName() + "</td>");
				out.print("</tr>");
		%>
		<%
			}
		%>
	</table>
	<center>
		<table>
			<tr>
				<td><a href="typeUpdate.jsp">更新商品种类</a></td>
				<td><a href="typeDelete.jsp">删除商品种类</a></td>
				<td><a href="typeAdd.jsp">添加商品种类</a></td>
			</tr>
		</table>
	</center>

</body>
</html>