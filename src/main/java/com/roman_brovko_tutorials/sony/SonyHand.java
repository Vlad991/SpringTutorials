package com.roman_brovko_tutorials.sony;

import com.roman_brovko_tutorials.interfaces.Hand;

public class SonyHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Sony hand catches something!");
    }
}
