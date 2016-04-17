/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyImplementation;

import Myinterface.MyProvider;

/**
 *
 * @author Karim
 */
public class ThirdProvider implements MyProvider{

    @Override
    public String getMsg() {
        return "Hello from Third Provider";
    }
    
}
