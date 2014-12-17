import javax.servlet.ServletContext;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import zadatak2.UserMessage;

import java.util.List;
import java.util.LinkedList;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		
		if(request.getParameter("submit") != null){
				request.getSession().setAttribute("username", request.getParameter("user"));
				response.sendRedirect("ChatRoom.jsp?username="+request.getSession().getAttribute("username"));
		}		
		else{
			List<UserMessage> messages = (List)sc.getAttribute("messages");
			for(int i=0; i<messages.size(); i++){
				request.setAttribute("message", messages.get(i));
			}
		}
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		ServletContext sc = getServletContext();
		List<UserMessage> messages = (List)sc.getAttribute("messages");
		String user=(String)request.getSession().getAttribute("username");		
		if(request.getParameter("send") != null){			
			String message =(String) request.getParameter("message");						
			if(messages != null){
				messages.add(new UserMessage(user, message));
			}
			else{
				messages = new LinkedList();
				messages.add(new UserMessage(user, message));
				sc.setAttribute("messages", messages);
			}
		}
		response.sendRedirect("ChatRoom.jsp?username="+user);		
	}
}
