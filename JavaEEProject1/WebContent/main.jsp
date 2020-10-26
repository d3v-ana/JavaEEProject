<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="org.model.*"%>
<html>
<head>
<title>图书管理系统</title>
</head>
<body bgcolor="#E3E3E3">
	<%
		User user = (User) session.getAttribute("user");
	%>
	<%=user.getUsername()%>，您好！欢迎您使用图书管理系统！！！
</body>
</html>
