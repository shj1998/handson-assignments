package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("user");
		String Password = request.getParameter("pass");
		String Phone = request.getParameter("phone");
		String DOB = request.getParameter("dob");
		long phoneNumber = Long.parseLong(Phone);
		UserService service=(UserService)UserFactory.getInstance("service");
		User user = new User();
		user.setUserName(Username);
		user.setPassword(Password);
		user.setPhoneNumber(phoneNumber);
		user.setDOB(DOB);
		User registered = service.createUser(user);
		RequestDispatcher rd = request.getRequestDispatcher("registersuccess.html");
		rd.forward(request, response);
	}

}
