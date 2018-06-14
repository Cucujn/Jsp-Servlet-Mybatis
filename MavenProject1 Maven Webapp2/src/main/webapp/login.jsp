<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>管理员登陆</title>
</head>
<body>
	<center>
		<h1>管理员登陆</h1>
		<form action="adminServlet" method="post">
			<table >
				<tr>
					<td>请输入账号：</td>
					<td><input type="text" name="AdminId"></td>
				</tr>
				<tr>
					<td>请输入密码：</td>
					<td><input type="password" name="AdminPassword"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="提交"></td>
					<td><input type="reset" name="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>