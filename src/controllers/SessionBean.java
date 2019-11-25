package controllers;

import model.Captcha;

import javax.servlet.RequestDispatcher;

public class SessionBean {
    //Insert your Code for Captcha here
    String answer;
    Captcha captchaObj;
    String name;
    SessionBean(){
        captchaObj = new Captcha();;
    }
    public  void randomSelect(){
        // randomly selects an image.

   /*     RequestDispatcher rd;
        if(captchaObj.validateCaptcha( answer) ){//image name is stored as actual answer
            rd=request.getRequestDispatcher("/result.jsp");
            rd.forward(request, response);
        }else{
            rd=request.getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
        }*/
    }
    public  void getImage()
    {
        // gets data for image.
    }
    public  void  setAnswerText(String answer){
          this.answer=answer;
    }
    public  void  getAnswerFromSelection(){
        //Using dropdown list to add a separate function
       // returning the selection data and correct answer index.
    }

    public String getName() {
        return name;
    }
}
