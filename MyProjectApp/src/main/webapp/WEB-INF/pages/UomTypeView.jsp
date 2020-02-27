<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO UOM DATA VIEW</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<td>${ob.uomId }</td>
		</tr>
		<tr>
			<th>Type</th>
			<td>${ob.uomType }</td>
		</tr>
		<tr>
			<th>Model</th>
			<td>${ob.uomModel}</td>
		</tr>
		<tr>
			<th>D</th>
			<td>${ob.uomDiscription }</td>
		</tr>
	</table>
</body>
</html>