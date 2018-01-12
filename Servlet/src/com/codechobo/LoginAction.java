package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//		throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");

		
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			
			if(id.equals("asdf") && pwd.equals("1234")) {
				//id와 pwd가 일치하는 경우
				response.sendRedirect("/");
			}else {
				//id와 pwd가 일치하지 않는 경우
				request.setAttribute("msg", "id 또는 비밀번호가 틀립니다.");		//request객체에 메세지저장
				
				RequestDispatcher reqDis = request.getRequestDispatcher("/loginForm.jsp");
				reqDis.forward(request, response);
			}
			
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html");
			out.println("<html>");
			out.println("<head");
			out.println("</head");
			out.println("<body>");
			out.println("<h1>Hello, "+id+".</h1>");
			out.println("<h1>Your password is "+pwd+".</h1>");
			out.println("</body>");
			out.println("</html>");
	
			response.setContentType("text/html");
			
//		int random = (int)(Math.random() * 5)+1;
//		int random1 = (int)(Math.random() * 5)+1;
//			
//			out.println("<img src ='images/dice"+random+".jpg'>");
//			out.println("<img src ='images/dice"+random1+".jpg'>");
			
			

			
		}
		
		
		
	}
	

//out.println("<img src =\"images/dice"+2+".jpg\">");  			경로지정 방법 두가지