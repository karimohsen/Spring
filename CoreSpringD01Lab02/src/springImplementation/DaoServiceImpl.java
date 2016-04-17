/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springImplementation;

import config.UserData;
import springInterface.DaoInterface;
import springInterface.DaoService;

/**
 *
 * @author Karim
 */
public class DaoServiceImpl implements DaoService {

    DaoInterface dao;

    @Override
    public void save(UserData da) {
        dao.saveEmployee(da);
    }

    public DaoInterface getDao() {
        return dao;
    }

    public void setDao(DaoInterface dao) {
        this.dao = dao;
    }

}
