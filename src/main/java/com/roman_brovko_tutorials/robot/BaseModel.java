package com.roman_brovko_tutorials.robot;

import com.roman_brovko_tutorials.interfaces.Hand;
import com.roman_brovko_tutorials.interfaces.Head;
import com.roman_brovko_tutorials.interfaces.Leg;
import com.roman_brovko_tutorials.interfaces.Robot;

public abstract class BaseModel implements Robot {
    private Hand hand;
    private Leg leg;
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
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

//    @Override
//    public String toString() {
//        return "BaseModel{" +
//                "hand=" + hand +
//                ", leg=" + leg +
//                ", head=" + head +
//                '}';
//    }
}
