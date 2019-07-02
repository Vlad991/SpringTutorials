package com.roman_brovko_tutorials.main;

import com.roman_brovko_tutorials.interfaces.Robot;
import com.roman_brovko_tutorials.interfaces.RobotConveyor;
import com.roman_brovko_tutorials.robot.ModelT1000;
import com.roman_brovko_tutorials.sony.SonyHand;
import com.roman_brovko_tutorials.sony.SonyHead;
import com.roman_brovko_tutorials.toshiba.ToshibaLeg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        RobotConveyor t1000Conveyor = context.getBean("t1000Conveyor", RobotConveyor.class);

        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        System.out.println("terminator1 " + terminator1);
        System.out.println("terminator2 " + terminator2);
        System.out.println("terminator3 " + terminator3);
    }
}
