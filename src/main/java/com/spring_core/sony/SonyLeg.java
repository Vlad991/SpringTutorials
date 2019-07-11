package com.spring_core.sony;

import com.spring_core.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Sony leg goes!");
    }
}
