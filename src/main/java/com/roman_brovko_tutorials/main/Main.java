package com.roman_brovko_tutorials.main;

import com.roman_brovko_tutorials.interfaces.Robot;
import com.roman_brovko_tutorials.robot.ModelT1000;
import com.roman_brovko_tutorials.sony.SonyHand;
import com.roman_brovko_tutorials.sony.SonyHead;
import com.roman_brovko_tutorials.toshiba.ToshibaLeg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Robot modelT1000 = context.getBean("t1000", ModelT1000.class);

        modelT1000.action();
    }
}
