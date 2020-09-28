package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class AddItemServlet
 */
@WebServlet("/Add")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<String> list =new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemServlet() {
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
		pw.print("AddItem Servlet GET method");
		pw.print("</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String itemname = request.getParameter("item");
		ArrayList<String> list = null;
		
		if((ArrayList<String>) session.getAttribute("itemlist")==null) {
			list = new ArrayList<String>();
			list.add(itemname);
		}
		else {
			list = (ArrayList<String>) session.getAttribute("itemlist");
			list.add(itemname);
			
		}
		session.setAttribute("itemlist", list);
		RequestDispatcher rd = request.getRequestDispatcher("additem.html");
		rd.include(request, response);
		pw.print("<html><body><p>");
		pw.print("Current list size is : " + list.size());
		pw.print("</p></body></html>");
	}

}
