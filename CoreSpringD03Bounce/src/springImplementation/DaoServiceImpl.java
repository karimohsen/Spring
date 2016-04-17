/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springImplementation;

import config.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springInterface.DaoInterface;
import springInterface.DaoService;

/**
 *
 * @author Karim
 */
@Service
public class DaoServiceImpl implements DaoService {

    DaoInterface dao;

    @Override
    public void save(UserData da) {
        dao.saveEmployee(da);
    }

    public DaoInterface getDao() {
        return dao;
    }
    @Autowired
    public void setDao(DaoInterface dao) {
        this.dao = dao;
    }

}
