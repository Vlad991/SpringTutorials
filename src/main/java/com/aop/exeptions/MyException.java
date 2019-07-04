package com.aop.exeptions;

import org.springframework.stereotype.Component;

@Component
public class MyException extends Exception {

    public void showException(Exception exception) {
        System.out.println("MyException: " + exception);
    }

    public void init() {
        System.out.println("MyException.init()");
    }

    public void close() {
        System.out.println("MyException.close()");
    }

}
