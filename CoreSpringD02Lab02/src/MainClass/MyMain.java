/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainClass;

import Myinterface.MyReinder;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Karim
 */
public class MyMain {
    public static void main(String[] args) {
     //           BeanFactory fact = new XmlBeanFactory(new FileSystemResource("src/SpringConfig.xml"));
        AbstractApplicationContext con = new ClassPathXmlApplicationContext("SpringConfig.xml");
        MyReinder rend = (MyReinder)con.getBean("firstrendrer");
        rend.render();
        MyReinder rendTwo = (MyReinder)con.getBean("secondrendrer");
        rendTwo.render();
        con.registerShutdownHook();
    }
}
