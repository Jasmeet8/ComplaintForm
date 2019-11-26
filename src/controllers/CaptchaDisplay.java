package controllers;

import model.Captcha;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CaptchaDisplay
 */
@WebServlet("/CaptchaDisplay")
public class CaptchaDisplay extends HttpServlet {

    public CaptchaDisplay() {
    }

	/**
	 * The servlet randomly select an image from Captcha class and send it to the client for display
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Captcha obj=(Captcha)(request.getAttribute("captcha"));
		//get servlet context from session bean
		obj.selectRandomCaptcha();
		//Here we will be displaying the image
		response.setContentType(obj.getMimeType());
		ServletOutputStream out = response.getOutputStream();
		obj.getImageData(out);
		out.close();

	}




}
