package mypkg;

/**
 * Created by Karim on 05/04/15.
 */
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public  class BeforeAspect
{


    @Before("execution(* mypkg.Calculator.add(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("Before method");
        System.out.println("Method name >>> : " + joinPoint.getSignature().getName());
    }



}