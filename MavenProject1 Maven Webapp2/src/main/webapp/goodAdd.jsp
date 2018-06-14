<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
</head>
<body>
	<center>
		<h1>添加商品</h1>
		<form action="goodServlet" method="post">
		<input type="hidden" name="goodOperation" value="goodAdd">
			<table>
				<tr>
					<td>商品名称：</td>
					<td><input type="text" name="GoodName"></td>
				</tr>
				<tr>
					<td>商品价格：</td>
					<td><input type="text" name="GoodPrice"></td>
				</tr>
				<!-- <tr><td>商品种类：</td><td><input type="text" name="GoodType"></td></tr> -->
				<tr>
					<td>商品库存：</td>
					<td><input type="text" name="GoodStore"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="提交"></td>
					<td><a href="goodManage.jsp">返回上一级</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>