/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PkgImplementation;

import PkgInterface.Calculator;

/**
 *
 * @author Karim
 */
public class Calc implements Calculator{

    @Override
    public double add(double a, double b) {
        double z = a+b;
        return z;
    }

    @Override
    public double sub(double a, double b) {
        double z = a-b;
        return z;
    }

    @Override
    public double mul(double a, double b) {
        double z = a*b;
        return z;
    }

    @Override
    public double div(double a, double b) {
        double z = a/b;
        return z;
    }
    
}
