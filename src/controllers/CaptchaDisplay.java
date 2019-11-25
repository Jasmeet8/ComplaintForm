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

		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		Captcha obj=new Captcha();
		//Here we will be displaying the image
	 	obj.displayRandomCaptcha(out);
		out.close();

	}




}
