package com.spring_core.toshiba;

import com.spring_core.interfaces.Hand;

public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Toshiba hand catches something!");
    }
}
