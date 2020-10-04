<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> Your reservation is confirmed successfuly. Please, re-check the detail.</p>
	First name : ${reservation.firstName};
	<br><br>
	Last name : ${reservation.lastName};
	<br><br>
	Gender : ${reservation.gender};
	<br><br>
	Meals:
	<ul>
	<c:forEach var="meal" items= "${reservation.food}">
	<li>${meal}</li>
	</c:forEach>
	</ul>
	Leaving from : ${reservation.cityFrom}
	<br>
	Going to : ${reservation.cityTo}
	
</body>
</html>