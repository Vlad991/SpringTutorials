package com.aop.exeptions;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyException extends Exception {

    @Pointcut("execution(* getFractionOfDivision(..))")  // Advice
    private void getDivision() {
    }

    @AfterThrowing(pointcut = "getDivision()", throwing = "exception")
    public void showException(Exception exception) {
        System.out.println("MyException: " + exception);
    }

    @Before("getDivision()")
    public void init() {
        System.out.println("MyException.init()");
    }

    @After("getDivision()")
    public void close() {
        System.out.println("MyException.close()");
    }

}
