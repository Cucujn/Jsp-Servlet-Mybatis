<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品种类</title>
</head>
<body>
	<center>
		<h1>添加商品种类</h1>
		<form action="typeServlet" method="post">
		<input type="hidden" name="typeOperation" value="typeAdd">
			<table>
				<tr>
					<td>种类名称：</td>
					<td><input type="text" name="TypeName"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="提交"></td>
					<td><a href="typeManage.jsp">返回上一级</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>