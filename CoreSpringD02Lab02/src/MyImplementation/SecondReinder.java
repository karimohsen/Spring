/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyImplementation;

import Myinterface.MyProvider;
import Myinterface.MyReinder;
import java.util.List;

/**
 *
 * @author Karim
 */
public class SecondReinder implements MyReinder{
List<MyProvider> pd;

    public SecondReinder(List<MyProvider> pd) {
        this.pd = pd;
    }

    
    @Override
    public void render() {
        for(int i = 0 ; i < pd.size() ; i++){
            System.out.println(pd.get(i).getMsg());
        }
    }

   
}
