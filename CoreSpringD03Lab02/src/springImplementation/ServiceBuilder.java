/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springImplementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Karim
 */
@Component
public class ServiceBuilder {
    static Session session;
    @Bean
    public Session sessionFactoryBuilder(){
        if(session == null){
        SessionFactory fact = new Configuration().configure("config/hibernate.cfg.xml").buildSessionFactory();
        session = fact.openSession();
        }
        return session;
    }
}
