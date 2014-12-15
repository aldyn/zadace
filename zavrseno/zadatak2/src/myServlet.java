import javax.servlet.ServletContext;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import zadatak2.userMessage;

import java.util.List;
import java.util.LinkedList;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//chatRoom.jsp
		ServletContext sc = getServletContext();
		
		if(request.getParameter("submit") != null){
				request.getSession().setAttribute("username", request.getParameter("user"));
				response.sendRedirect("chatRoom.jsp?username="+request.getSession().getAttribute("username"));
			}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		ServletContext sc = getServletContext();
		List<userMessage> messages = (LinkedList)sc.getAttribute("messages");
		String user=(String)request.getSession().getAttribute("username");		
		if(request.getParameter("send") != null){			
			String message =(String) request.getParameter("message");						
			if(messages != null){
				messages.add(new userMessage(user, message));
			}
			else{
				messages = new LinkedList();
				messages.add(new userMessage(user, message));
				sc.setAttribute("messages", messages);
			}
		}
		response.sendRedirect("chatRoom.jsp?username="+user);		

	}

}
