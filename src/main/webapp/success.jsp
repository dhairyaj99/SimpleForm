<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h2>Form submitted successfully!</h2>
	<p>Name: <%= request.getAttribute("name") %></p>
	<p>Last Name: <%= request.getAttribute("lastname") %></p>
	<p>Address: <%= request.getAttribute("address") %></p>
	<p>Gender: <%= request.getAttribute("gender") %></p>
</body>
</html>
