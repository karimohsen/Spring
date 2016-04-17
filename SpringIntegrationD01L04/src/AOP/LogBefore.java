/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AOP;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Karim
 */
public class LogBefore implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("Before : The Method : "+method.getName() +";"+" The arguments: "+Arrays.toString(os));
    }
    
}
