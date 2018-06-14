<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除商品</title>
</head>
<body>
<form action="goodServlet" method="post">
		<input type="hidden" name="goodOperation" value="goodDelete">
		<table>
			<tr>
				<td>请输入商品id:</td>
				<td><input type="text" name="GoodId">
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="提交"></td>
				<td><a href="goodManage.jsp">返回上一级</a></td>
			</tr>
		</table>
	</form>
</body>
</html>