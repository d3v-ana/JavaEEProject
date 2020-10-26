<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>图书管理系统</title>
</head>
<body bgcolor="#71CABF">
	<form action="LoginServlet" method="post">
		<table>
			<caption>用户登录</caption>
			<tr>
				<td>登录名：</td>
				<td><input type="text" name="userName" size=”20” /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" size=”21” /></td>
			</tr>
		</table>
		<input type="submit" value="登录" /> <input type="reset" value="重置" />
	</form>
</body>
</html>