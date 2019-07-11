package com.spring_core.toshiba;

import com.spring_core.interfaces.Head;

public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Toshiba head calc!");
    }
}
