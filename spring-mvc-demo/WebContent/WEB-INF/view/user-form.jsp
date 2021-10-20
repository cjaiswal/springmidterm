<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style> <%-- inline css --%>
.error {color:red}
</style>
</head>
<body>
<i> Fill out the form. </i>
	<form:form action="processForm" modelAttribute="user">
	 Name: <form:input path="name" cssClass="error"/>
		<br>
		<br>
	Phone Number: <form:input path="phoneNumber" cssClass="error" />
		<br>
		<br>

		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>