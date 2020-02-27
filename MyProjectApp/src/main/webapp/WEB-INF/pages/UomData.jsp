<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="menu.jsp"%>
<body>
	<h3>WELCOME TO UOM TYPE DATA PAGE</h3>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>UOM ID</th>
					<th>UOM TYP</th>
					<th>UOM MODEL</th>
					<th>DISCRIPTION</th>
					<th colspan="3">Operation</th>
				</tr>
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.uomId}</td>
						<td>${ob.uomType}</td>
						<td>${ob.uomModel}</td>
						<td>${ob.uomDiscription}</td>
						<td><a href="delete?sid=${ob.uomId}">DELETE</a></td>
						<td><a href="view?sid=${ob.uomId}">VIEW</a></td>
						<td><a href="edit?sid=${ob.uomId}">EDIT</a></td>
                         
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h4>NO DATA FOUND</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>