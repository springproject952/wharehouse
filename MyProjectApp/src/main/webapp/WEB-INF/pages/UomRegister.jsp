<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to uom Data</h3>
	<form action="saved" method="post">
		<pre>
UOM TYPE:
<select name="uomType">
<option>---SELECT---</option>
<option>PACKING</option>
<option>NO PACKING</option>
<option>N.  A</option>
</select>
UOM MODEL  :
<input type="text" name="uomModel" />
DISCREPTION:
<input type="text" name="uomDiscription">
<input type="submit" value="submit">
</pre>
	</form>
	${Message }
</body>

</html>