<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="menu.jsp"%>
<body>
	<h3>WELCOME TO UOM TYPE EDIT PAGE</h3>
	<form:form action="update" method="POST" modelAttribute="createUom">
		<pre>
	Uom Id :  <form:input path="uomId" readonly="true"/>
	 <form:input path="uomType" />
	<form:input path="uomModel" />
	<form:input path="uomDiscription" />
	<input type="submit" value="update" />
	</pre>
	</form:form>
</body>
</html>