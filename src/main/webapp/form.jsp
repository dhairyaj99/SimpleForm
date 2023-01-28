<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Form</title>
</head>
<body>
	<form action="FormHandler" method="post">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" required><br>
		<label for="lastname">Last Name:</label>
		<input type="text" id="lastname" name="lastname" required><br>
		<label for="address">Address:</label>
		<input type="text" id="address" name="address"><br>
		<label for="gender">Gender:</label>
		<input type="radio" id="gender" name="gender" value="male" required> Male
		<input type="radio" id="gender" name="gender" value="female" required> Female<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
