package com.spring_core.sony;

import com.spring_core.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Sony head calc!");
    }
}
