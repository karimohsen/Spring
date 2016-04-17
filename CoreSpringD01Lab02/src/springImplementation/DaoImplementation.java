/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springImplementation;

import config.UserData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import springInterface.DaoInterface;

/**
 *
 * @author Karim
 */
public class DaoImplementation implements DaoInterface{
    Session sb;
    @Override
    public void saveEmployee(UserData data) {
        sb.beginTransaction();
        sb.save(data);
        sb.getTransaction().commit();
    }

    public void setSb(Session sb) {
        this.sb = sb;
    }

    
    
}
