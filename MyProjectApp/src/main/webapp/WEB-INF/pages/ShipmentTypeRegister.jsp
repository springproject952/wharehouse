<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h3>WELCOME TO SHIPMENT TYPE </h3>
<form:form action="save" method="POST" modelAttribute="shipmentType">
<pre>
Shipment Mode:
<form:select path="shipMode">
<form:option value="">SELECT</form:option>
<form:option value="Air">Air</form:option>
<form:option value="Truck">Truck</form:option>
<form:option value="Ship">Ship</form:option>
<form:option value="Train">Train</form:option>
</form:select>
Shipment code:
<form:input path="shipCode"/>
Enable Shipment:
<form:select path="entbShip">
<form:option value="">SELECT</form:option>
<form:option value="YES">YES</form:option>
<form:option value="NO">NO</form:option>
</form:select>
Shipment Grade:
<form:radiobutton path="shipGrad" value="A"/>A
<form:radiobutton path="shipGrad" value="B"/>B
<form:radiobutton path="shipGrad" value="C"/>C
Discription:
<form:textarea path="shipDisc"/>
<input type="submit"value="submit">
</pre>
</form:form>
${Message}
</body>
</html>