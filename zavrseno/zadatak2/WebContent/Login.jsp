<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="ChatRoom.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login form</title>
</head>
<body>
	<h1>My Chat App!</h1>
	<table class="table2">
	<tr>
		<td colspan=2>Username:</td>
	</tr>
	<form action="MyServlet" method="get">
		<tr>
			<td><input type="text" name="user"></td>
			<td><input type="submit" name="submit" value="Login"></td>
		</tr>			
	</form>
	</table>
</body>
</html>
