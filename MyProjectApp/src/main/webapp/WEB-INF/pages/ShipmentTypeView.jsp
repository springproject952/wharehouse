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
	<h3>WELCOME TO SHIPMENTTYPE DATA VIEW</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<td>${ob.shipId }</td>
		</tr>
		<tr>
			<th>MODE</th>
			<td>${ob.shipMode }</td>
		</tr>
		<tr>
			<th>CODE</th>
			<td>${ob.shipCode}</td>
		</tr>
		<tr>
			<th>ENABLE</th>
			<td>${ob.entbShip }</td>
		</tr>
		<tr>
			<th>GRADE</th>
			<td>${ob.shipGrad }</td>
		</tr>
		<tr>
			<th>NOTE</th>
			<td>${ob.shipDisc}</td>
		</tr>
	</table>
</body>
</html>