package com.roman_brovko_tutorials.robot;

import com.roman_brovko_tutorials.interfaces.Hand;
import com.roman_brovko_tutorials.interfaces.Head;
import com.roman_brovko_tutorials.interfaces.Leg;

public class ModelT1000 extends BaseModel {
    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super();
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        getHand().catchSomething();
        getLeg().go();
        getHead().calc();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    @Override
    public void dance() {
        System.out.println("T1000 id dancing!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
