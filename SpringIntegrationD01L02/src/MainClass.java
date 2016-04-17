
import PkgInterface.Calculator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karim
 */
public class MainClass {
    public static void main(String[] args) {
        AbstractApplicationContext fact = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
        Calculator c = (Calculator)fact.getBean("calcproxy");
        c.add(5.2, 3.7);
        c.sub(3.6, 9.0);
    }
}
