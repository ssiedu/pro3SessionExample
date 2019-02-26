package com.ssi.sm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//reading userid from session
		//step-1 (fetch the session created for this user)
		HttpSession session=request.getSession();
		//step-2 (read the data using getAttribute method)
		String username=(String) session.getAttribute("user");
		
		if(username==null){
			response.sendRedirect("index.jsp");
		}
		
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Welcome "+username+"</h3>");
		out.println("<h4>You Are Requesting ServletOne</h4>");
		out.println("<h5><a href=dashboard.jsp>Home</a></h5>");
		out.println("</body></html>");
		
	}

}
