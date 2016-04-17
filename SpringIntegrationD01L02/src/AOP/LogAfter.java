/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AOP;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author Karim
 */
public class LogAfter implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("After: The Method : "+method.getName() +";"+" The arguments: "+Arrays.toString(os));
    }
    
}
