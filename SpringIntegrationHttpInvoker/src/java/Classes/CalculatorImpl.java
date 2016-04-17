/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author karim
 */
public class CalculatorImpl  implements Calculator{

    @Override
    public double add(double num1, double num2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    double result=num1+num2;
    return result;
    
    }

    @Override
    public double sub(double num1, double num2) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     double result=num1-num2;
    return result;
    
    }

    @Override
    public double mul(double num1, double num2) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      double result=num1*num2;
    return result;
    
    
    }

    @Override
    public double div(double num1, double num2) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
      double result=num1/num2;
    return result;
    
    }
    
}
