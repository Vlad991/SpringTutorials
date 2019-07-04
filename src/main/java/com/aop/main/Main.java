package com.aop.main;

import com.aop.exeptions.MyException;
import com.aop.objects.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws MyException {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/context.xml");
        SomeService service = context.getBean("someService", SomeService.class);
        double val = service.getDoubleValue();
        int result = service.getFractionOfDivision(1, 1);
    }
}