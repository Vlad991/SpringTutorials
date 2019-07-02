package com.roman_brovko_tutorials.toshiba;

import com.roman_brovko_tutorials.interfaces.Hand;

public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Toshiba hand catches something!");
    }
}
