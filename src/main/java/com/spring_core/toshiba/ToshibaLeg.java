package com.spring_core.toshiba;

import com.spring_core.interfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Toshiba leg goes!");
    }
}
