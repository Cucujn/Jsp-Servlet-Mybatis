<%@page import="com.cjn.entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTf-8"
	pageEncoding="UTf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTf-8">
<title>显示功能</title>
</head>
<body>
	<%
		Admin admin = (Admin) session.getAttribute("admin");
		String AdminName = admin.getAdminName();
	%>
	<center>
		<h1><%=AdminName%>您好！欢迎来到商城后台管理系统</h1>
		<form action="goodServlet" method="post">
		<table border="1" width="600">
			<tr>
			<th>查看商品列表</th>
			<th>添加</th>
			<th>删除</th>
			<th>更新</th>
			</tr>
			<tr>
				<td><a href="typeManage.jsp">商品类别查看</a></td>
				<td><a href="typeAdd.jsp">添加商品类别</a></td>
				<td><a href="typeDelete.jsp">删除商品类别</a></td>
				<td><a href="typeUpdate.jsp">更新商品类别</a></td>
			</tr>
			<tr>
				<td><a href="goodManage.jsp">商品查看</a></td>
				<td><a href="goodAdd.jsp">添加商品</a></td>
				<td><a href="goodDelete.jsp">删除商品</a></td>
				<td><a href="goodUpdate.jsp">更新商品</a></td>
			</tr>
		</table>
		</form>
	</center>
</body>
</html>