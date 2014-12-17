<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="ChatRoom.css">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ChatRoom</title>
</head>
<body>
	<table width:50% class="table1">
			<tr>
			<td colspan=2>
			<div width=50% id="scroll_down" class="scroll">
			<table>
			<c:forEach var="message" items="${messages}">
				<tr>
				<td class="user" width=20%> ${message.getUser()}</td>
				<td class="message"> ${message.getMessage()}</td>								
				</tr>
			</c:forEach>
			</table>
			</div>
	<script type="text/javascript">
		var divid = document.getElementById("scroll_down");
		divid.scrollTop = divid.scrollHeight;
		divid.scrollLeft = divid.scrollWidth;
	</script>			
			<hr>
			</td>
			</tr>
			<tr>			
				<form action="MyServlet" method="post">
				<td align="center" width=80%> <textarea cols="65" rows="2" name="message"> </textarea></td>
				<td> <input type="submit" name="send" value="Send">					 
				 <input type="submit" name="refresh" value="Refresh"></td>
			</form>	
			</tr>		
		</tr>
	</table>
</body>
</html>
