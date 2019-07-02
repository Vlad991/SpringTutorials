package com.roman_brovko_tutorials.robot;

import com.roman_brovko_tutorials.interfaces.Hand;
import com.roman_brovko_tutorials.interfaces.Head;
import com.roman_brovko_tutorials.interfaces.Leg;
import com.roman_brovko_tutorials.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier("sonyGoldenHand")
    private Hand hand;

    @Autowired(required = false)
    @Qualifier("sonyLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyHead")
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
