/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
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
        UserData data = new UserData();
        data.setUserName("hasby allah");
        data.setBirthday(new Date());
        data.setPhone("65656");
        data.setFullName("7asby allah w n3m el wakel");
        data.setAddress("haram");
        data.setPassword("password");
        data.setImage(bFile);
        AbstractApplicationContext fact = new ClassPathXmlApplicationContext("SpringConfig.xml");
        DaoService serviceInterface =  fact.getBean(DaoService.class);
        serviceInterface.save(data);
    }

}
