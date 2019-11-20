package controllers;

import model.Complaint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComplaintController
 */
//@WebServlet("/ComplaintController")
public class ComplaintController extends HttpServlet {

    public ComplaintController() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter(“name");

				String email=request.getParameter(“email");
						String phone=request.getParameter(“phone");
								String complaint=request.getParameter(“complaint");
		//redirect to Complaint.jsp
										Complaint obj=new ComplaintController(name, email,phone, complaint);
		//Complaint object created and data passed
		request.sendRedirect("/result.jsp");
	}



}
