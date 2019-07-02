package com.roman_brovko_tutorials.sony;

import com.roman_brovko_tutorials.interfaces.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Sony leg goes!");
    }
}
