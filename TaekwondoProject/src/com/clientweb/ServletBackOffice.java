package com.clientweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
public class ServletBackOffice extends HttpServlet {

	private String paramLogin;
	private String paramPassword;


	private static final long serialVersionUID = 1L;

	public ServletBackOffice() {
		this.paramLogin = "zero";
		this.paramPassword = "zoro";	
		
	}
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String message = "Transmission de variables : OK !";
		request.setAttribute( "test", message );  
		this.getServletContext().getRequestDispatcher( "/WEB-INF/backoffice.jsp" ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		System.out.println(login);
		System.out.println(pwd);
		System.out.println("*********");
		System.out.println(this.paramLogin);
		System.out.println(this.paramPassword);
		RequestDispatcher dispatcher = null;


		if(this.paramLogin.equalsIgnoreCase(login) && this.paramPassword.equalsIgnoreCase(pwd)){
			dispatcher = request.getRequestDispatcher("/accueil.jsp");
		}else{
			dispatcher = request.getRequestDispatcher("/login.jsp");
		}
		dispatcher.forward(request, response);
	}

}