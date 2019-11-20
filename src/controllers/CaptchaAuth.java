package controllers;

import model.Captcha;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CaptchaAuth
 */
@WebServlet("/CaptchaAuth")
public class CaptchaAuth extends HttpServlet {

    public CaptchaAuth() {
    }

	/**
	 * The servlet randomly select an image and send it to the client
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Captcha obj=new Captcha();
		File file=new File("file_location");
		//file location has 3 images, so retreive them in an arraylist
		ArrayList<String> ImgFiles = new ArrayList<>();
		for (final File fileEntry : file.listFiles()) {
			ImgFiles.add(fileEntry.getName());
		}
		//display random image
		Random rand = new Random();
		String imgName=ImgFiles.get(rand.nextInt(ImgFiles.size()));
		//Here we will be displaying the image
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		FileInputStream fin = new FileInputStream(imgName);
		BufferedInputStream bin = new BufferedInputStream(fin);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int ch =0; ;
		while((ch=bin.read())!=-1)
		{
			bout.write(ch);
		}

		bin.close();
		fin.close();
		bout.close();
		out.close();

		//image name is stored as actual answer
		obj.validateCaptcha( request.getParameter("fruit"), imgName);
	}




}
