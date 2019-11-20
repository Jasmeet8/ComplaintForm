package controllers;

import model.Captcha;
import model.Complaint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ComplaintController")
public class ComplaintController extends HttpServlet {

    public ComplaintController() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String phone=  request.getParameter("phone");
		String complaint= request.getParameter("complaint");

		String fruit=request.getParameter("fruit");
		Complaint obj=new Complaint(name, email,phone, complaint);
		//Complaint object created and dataanswer passed
		SessionBean bean=new SessionBean();
		bean.setAnswerText(fruit);
		request.setAttribute("bean",bean);
		RequestDispatcher rd;

		//get captcha from  session,



	}



}
