package com.roman_brovko_tutorials.main;

import com.roman_brovko_tutorials.configuration.AutoConfiguration;
import com.roman_brovko_tutorials.interfaces.Robot;
import com.roman_brovko_tutorials.interfaces.RobotConveyor;
import com.roman_brovko_tutorials.robot.ModelT1000;
import com.roman_brovko_tutorials.sony.SonyHand;
import com.roman_brovko_tutorials.sony.SonyHead;
import com.roman_brovko_tutorials.toshiba.ToshibaLeg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
