package com.roman_brovko_tutorials.toshiba;

import com.roman_brovko_tutorials.interfaces.Head;

public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Toshiba head calc!");
    }
}
