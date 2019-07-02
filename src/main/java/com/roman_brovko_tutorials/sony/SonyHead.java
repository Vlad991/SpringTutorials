package com.roman_brovko_tutorials.sony;

import com.roman_brovko_tutorials.interfaces.Head;

public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Sony head calc!");
    }
}
