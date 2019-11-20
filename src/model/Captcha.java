package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Captcha {

    String imgName;

    /**
     * To display a random image from a file location
     */

    public String displayRandomCaptcha(){
        File file=new File("file_location");
        //file location has 3 images, so retreive them in an arraylist
        ArrayList<String> ImgFiles = new ArrayList<>();
        for (final File fileEntry : file.listFiles()) {
            ImgFiles.add(fileEntry.getName());
        }
        Random rand = new Random();
        imgName=ImgFiles.get(rand.nextInt(ImgFiles.size()));
        return imgName;
    }
    /**
     * To Validate the answer for captcha
     * @param actualAnswer
     * @return true if expected answer matches the actual
     */
    public boolean validateCaptcha(String actualAnswer){
    if(imgName.contains(actualAnswer))
        return true;
    else return false;
    }

}
