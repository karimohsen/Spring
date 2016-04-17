package mypkg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloApp {
    public static void main(String[] args) {
        AbstractApplicationContext fact = new ClassPathXmlApplicationContext("spring-config.xml");
        Calculator cal = (Calculator) fact.getBean("calcImp");
        cal.add(5, 7);
        cal.sub(8, 4);
    }
}
