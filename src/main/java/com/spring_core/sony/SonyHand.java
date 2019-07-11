package com.spring_core.sony;

import com.spring_core.interfaces.Hand;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SonyHand implements Hand {
    private String color;

    public SonyHand() {
    }

    public SonyHand(String color) {
        this.color = color;
    }

    @Bean
    @Qualifier("hand")
    public SonyHand hand() {
        return new SonyHand();
    }

    @Bean
    @Qualifier("silverHand")
    public SonyHand silverHand() {
        return new SonyHand("silver");
    }

    @Override
    public void catchSomething() {
        System.out.println(color + " sony hand catches something!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
