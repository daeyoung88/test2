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
				//id�� pwd�� ��ġ�ϴ� ���
				response.sendRedirect("/");
			}else {
				//id�� pwd�� ��ġ���� �ʴ� ���
				request.setAttribute("msg", "id �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");		//request��ü�� �޼�������
				
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
	

//out.println("<img src =\"images/dice"+2+".jpg\">");  			������� ��� �ΰ���