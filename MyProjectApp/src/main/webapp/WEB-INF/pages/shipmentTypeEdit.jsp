<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="menu.jsp" %>
<body>
	<h3>WELCOME TO SHIPMENT TYPE EDIT PAGE</h3>
	<form:form action="update" method="POST" modelAttribute="shipmentType">
	<pre>
	Shipment Id:
	<form:input path="shipId" readonly="true"/>
	<form:input path="shipMode"/>
	<form:input path="shipCode"/>
	<form:input path="entbShip"/>
	<form:input path="shipGrad"/>
	<form:input path="shipDisc"/>
	
	
	<input type="submit" value="update"/>
	
	</pre>
	
	</form:form>
</body>
</html>