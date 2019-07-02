package com.roman_brovko_tutorials.sony;

import com.roman_brovko_tutorials.interfaces.Hand;

public class SonyHand implements Hand {
    private String color;

    @Override
    public void catchSomething() {
        System.out.println("Sony hand catches something!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
