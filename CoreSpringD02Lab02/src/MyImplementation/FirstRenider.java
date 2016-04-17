/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyImplementation;

import Myinterface.MyProvider;
import Myinterface.MyReinder;

/**
 *
 * @author Karim
 */
public class FirstRenider implements MyReinder{
    MyProvider firstprovider;

    public FirstRenider(MyProvider firstprovider) {
        this.firstprovider = firstprovider;
    }

    @Override
    public void render() {
        System.out.println(firstprovider.getMsg());
    }
}
