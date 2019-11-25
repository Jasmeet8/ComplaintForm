package model;

import javax.servlet.ServletOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

public class Captcha {

    String imgName;

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

    /**
     * To display a random image from a file location
     */
    public void displayRandomCaptcha(ServletOutputStream out){
        File file=new File("file_location");
        //file location has 3 images, so retreive them in an arraylist
        ArrayList<String> ImgFiles = new ArrayList<>();
        for (final File fileEntry : file.listFiles()) {
            ImgFiles.add(fileEntry.getName());
        }
        Random rand = new Random();
        imgName=ImgFiles.get(rand.nextInt(ImgFiles.size()));
        getImageData(out);
    }

    /**
     * To get image data in binary format or stream
     */
    public void getImageData(ServletOutputStream out){
       try {
           FileInputStream fin = new FileInputStream(imgName);
           BufferedInputStream bin = new BufferedInputStream(fin);
           BufferedOutputStream bout = new BufferedOutputStream(out);

           int ch = 0;
           ;
           while ((ch = bin.read()) != -1) {
               bout.write(ch);
           }

           bin.close();
           fin.close();
           bout.close();
       }
       catch (Exception e){
            System.out.println("Error is caught for "+e.getMessage());
       }
    finally {

       }
    }

}
