package com.roman_brovko_tutorials.sony;

import com.roman_brovko_tutorials.interfaces.Hand;
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
