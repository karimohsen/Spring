package mypkg;

/**
 * Created by ahmed on 05/04/15.
 */
public class CalcImp implements Calculator{

    @Override
    public double add(double a,double b){
        double z = a+b;
        System.out.println(a+"+"+b+"="+z);
        return z;
    }
    @Override
    public double sub(double a,double b){
        double z = a-b;
        System.out.println(a+"-"+b+"="+z);
        return z;
    }
    @Override
    public double mul(double a,double b){
        double z = a*b;
        System.out.println(a+"*"+b+"="+z);
        return z;
    }
    @Override
    public double div(double a,double b){
        double z = a/b;
        System.out.println(a+"/"+b+"="+z);
        return z;
    }
}
