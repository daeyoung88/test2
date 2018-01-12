package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	int count = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");

		
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html");
			out.println("<html>");
			out.println("<head");
			out.println("</head");
			out.println("<body>");
			out.println("<h1>Hello, "+id+".</h1>");
			out.println("<h1>Your password is "+pwd+".</h1>");
			out.println("<h1>count="+ ++count +".</h1>");
			out.println("</body>");
			out.println("</html>");
	
//			response.setContentType("text/html");
//			
//		int random = (int)(Math.random() * 5)+1;
//		int random1 = (int)(Math.random() * 5)+1;
//			
//			out.println("<img src ='images/dice"+random+".jpg'>");
//			out.println("<img src ='images/dice"+random1+".jpg'>");
			
			

			
		}
		
		
		
	}
	

//out.println("<img src =\"images/dice"+2+".jpg\">");  			경로지정 방법 두가지