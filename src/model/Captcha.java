package model;

public class Captcha {
    /**
     * To Validate the answer for captcha
     * @param expectedAnswer
     * @param actualAnswer
     * @return
     */
    public boolean validateCaptcha(String expectedAnswer, String actualAnswer){
    if(actualAnswer.contains(expectedAnswer))
        return true;
    else return false;
    }
}
