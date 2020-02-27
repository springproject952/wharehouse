<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h3> Welcome to Employee Registration </h3>
<form action="save" method ="post">
<pre>
Name  :<input type="text" name="empName">
Salary:<input type="text" name="empSal">
<input type="submit" value="Register">
</pre>
</form>
${msg }
</body>
</html>