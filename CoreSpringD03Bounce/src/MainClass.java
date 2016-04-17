/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import config.*;
import java.io.File;
import java.io.FileInputStream;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springInterface.DaoService;

/**
 *
 * @author Karim
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("D:\\iti images\\Dish Party_6-11-2014\\IMG_5376.jpg");
        byte[] bFile = new byte[(int) file.length()];
 
        try {
	     FileInputStream fileInputStream = new FileInputStream(file);
	     //convert file into array of bytes
	     fileInputStream.read(bFile);
	     fileInputStream.close();
        } catch (Exception e) {
	           System.out.println("Error in reading the image");
        }
        
//        data.setUserName("eeeee");
//        data.setBirthday(new Date());
//        data.setPhone("485151");
//        data.setFullName("rrrr qqq");
//        data.setAddress("haram");
//        data.setPassword("qweqwe");
//        data.setImage(bFile);
        AbstractApplicationContext fact = new ClassPathXmlApplicationContext("SpringConfig.xml");
        UserData data = (UserData)fact.getBean(UserData.class) ;
        DaoService serviceInterface = (DaoService)fact.getBean(DaoService.class);
        serviceInterface.save(data);
    }

}
