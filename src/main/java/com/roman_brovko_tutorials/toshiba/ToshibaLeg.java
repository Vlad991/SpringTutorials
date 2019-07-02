package com.roman_brovko_tutorials.toshiba;

import com.roman_brovko_tutorials.interfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Toshiba leg goes!");
    }
}
