/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancespring;

import Classes.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author karim
 */
public class InheritanceSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         ApplicationContext context = new ClassPathXmlApplicationContext("Classes/beans.xml");

     User user=(User)context.getBean("employee");
  System.out.println(user.getName()+user.getPhone());
       
  

    }
    
}
