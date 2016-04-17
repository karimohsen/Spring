/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Classes.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author karim
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Classes/beanClient.xml");  
Calculator calc = (Calculator)context.getBean("calculator");  
System.out.println(calc.add(5, 7));  



  
    }
    
}
