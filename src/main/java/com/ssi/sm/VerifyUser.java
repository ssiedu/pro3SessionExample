package com.ssi.sm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class VerifyUser
 */
public class VerifyUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		if(s1.equals("abc") || s1.equals("xyz")){
			
			//storing the userid to session object
			//step-1 (fetch the session created for this user
			HttpSession session=request.getSession();
			//step-2 (store the data to session)
			session.setAttribute("user", s1);
			response.sendRedirect("dashboard.jsp");
		}else{
			out.println("Invalid Account");
		}
		
		
	}

}
