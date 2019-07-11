package com.spring_core.main;

import com.spring_core.configuration.AutoConfiguration;
import com.spring_core.robot.ModelT1000;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AutoConfiguration.class);
        context.refresh();

        ModelT1000 model = context.getBean("modelT1000", ModelT1000.class);
        ModelT1000 model1 = context.getBean("model1", ModelT1000.class);
        ModelT1000 model2 = context.getBean("model2", ModelT1000.class);

        System.out.println("////////////////////////////////////////////");
        model.action();
        System.out.println("////////////////////////////////////////////");
        model1.action();
        System.out.println("////////////////////////////////////////////");
        model2.action();
    }
}
