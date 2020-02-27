<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<title>Insert title here</title>
</head>
<body>
<h1>Shipment Module</h1>
<a href="${root }/shipment/all">view all</a>||<a href="${root }/shipment/register">Register</a>
         <h1>Uom Module</h1><br>
<a href="${root }/uom/all">View All UOM</a> -- ||--  <a href="${root }/uom/uomdata">Register UOM Data</a>

</body>
</html>