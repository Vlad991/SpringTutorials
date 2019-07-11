package com.spring_core.robot;

import com.spring_core.interfaces.Hand;
import com.spring_core.interfaces.Head;
import com.spring_core.interfaces.Leg;
import com.spring_core.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier("silverHand")
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
