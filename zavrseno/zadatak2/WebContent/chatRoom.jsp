<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="chatRoom.css">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>chatRoom</title>
</head>
<body>

	<table width=50% style="position:fixed; left:25%; top:15%">
			<tr>
			<td colspan=2>
			<div width=50% id="scroll_down" class="scroll">
			
			<%@ page import="java.util.List" %>
			<%@ page import="java.util.LinkedList" %>
			<%@ page import="java.io.PrintWriter" %>
			<%@ page import="zadatak2.userMessage" %>
			<table>
			<%
			ServletContext sc = session.getServletContext();
			List<userMessage> messages = (LinkedList)sc.getAttribute("messages");
			PrintWriter pw = response.getWriter();
			if(messages != null){
				 
				for(int i=0; i < messages.size(); i++){%>
				<tr>
				<td class="user" width=20%> <%=(messages.get(i)).getUser()%>: </td>
				<td class="message"> <%=(messages.get(i)).getMessage()%></td>
								
				</tr>
					<%
				}
			}				
			%>
		
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
				<form action="myServlet" method="post">
				<td align="center" width=80%> <textarea cols="65" rows="2" name="message"> </textarea></td>
				<td> <input type="submit" name="send" value="Send">					 
				 <input type="submit" name="refresh" value="Refresh"></td>
			
			</form>	
			</tr>		
		</tr>
	</table>
</body>
</html>