package com.ssi.sm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTwo
 */
public class ServletTwo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String username=(String) session.getAttribute("user");
		if(username==null){
			response.sendRedirect("index.jsp");
		}
		
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Welcome "+username+"</h3>");
		out.println("<h4>You Are Requesting ServletTwo</h4>");
		out.println("<h5><a href=dashboard.jsp>Home</a></h5>");
		out.println("</body></html>");
	}

}
