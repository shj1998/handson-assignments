package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ContactDetailsServlet
 */
@WebServlet("/details")
public class ContactDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet is called");
		PrintWriter pw = response.getWriter();
		pw.print("<html><body><p>");
		pw.print("ContactDetail Servlet GET method");
		pw.print("</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost is called");
		PrintWriter pw = response.getWriter();
		// getParameter takes name of the parameter & returns the value in string format
		String firstname = request.getParameter("first");
		String lastname = request.getParameter("last");
		String phoneNo = request.getParameter("phno");
		String Email = request.getParameter("email");
		pw.print("<html><body><p>");
		HttpSession session = request.getSession();
		firstname = (String) session.getAttribute("key1");
		lastname = (String) session.getAttribute("key2");
		pw.print("<p>Session Id: "+session.getId()+"</p>");
		pw.print("<p>After Getting From Session, First Name: "+firstname+", Last Name: "+lastname+"</p>");
		pw.print("<p>Phone: "+phoneNo+", Email Id: "+Email+"</p>");
		pw.print("</body></html>");
	}

}
