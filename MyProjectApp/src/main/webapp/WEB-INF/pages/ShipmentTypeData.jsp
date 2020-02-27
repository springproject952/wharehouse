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
	<h3>WELCOME TO SHIPMENT TYPE DATA PAGE</h3>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>IO</th>
					<th>CODE</th>
					<th>GRADE</th>
					<th>MODE</th>
					<th>ENABLE</th>
					<th>NOTE</th>
					<th colspan="3">Operation</th>

				</tr>
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.shipId}</td>
						<td>${ob.shipMode}</td>
						<td>${ob.shipCode}</td>
						<td>${ob.entbShip}</td>
						<td>${ob.shipGrad}</td>
						<td>${ob.shipDisc}</td>
						<td><a href="delete?sid=${ob.shipId}"><img src="../resources/images/delete.png" width="30" height="40" /></a></td>
						<td><a href="edit?sid=${ob.shipId}">EDIT</a></td>
						<td><a href="view?shipId=${ob.shipId}">View</a></td>
						<td><a href="viewName?shipName=${ob.shipMode}">View with Name</a></td>
						
					</tr>
				</c:forEach>
			</table>
			<a href="excel">Excel Export</a>-    |    -<a href="pdf">PDF EXPORT</a>
		</c:when>
		<c:otherwise>
			<h4>NO DATA FOUND</h4>
		</c:otherwise>
	</c:choose>
	
	
	
	
</body>
</html>