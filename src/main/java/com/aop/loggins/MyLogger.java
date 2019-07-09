package com.aop.loggins;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {

    @Pointcut("execution(* com.aop.objects.SomeService.getDoubleValue(..)) && within(com.aop.objects.*)")
    private void getValue() {
    }

    @AfterReturning(pointcut = "getValue()", returning = "obj")
    public void printValue(Object obj) {
        System.out.println(obj);
    }

    @Before("getValue()")
    public void init() {
        System.out.println("MyLogger.init()");
    }

    @After("getValue()")
    public void close() {
        System.out.println("MyLogger.close()");
    }
}
