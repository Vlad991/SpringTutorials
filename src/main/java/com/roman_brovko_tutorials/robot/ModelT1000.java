package com.roman_brovko_tutorials.robot;

import com.roman_brovko_tutorials.interfaces.Hand;
import com.roman_brovko_tutorials.interfaces.Head;
import com.roman_brovko_tutorials.interfaces.Leg;
import com.roman_brovko_tutorials.interfaces.Robot;

public class ModelT1000 implements Robot {
    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void action() {
        hand.catchSomething();
        leg.go();
        head.calc();
    }

    @Override
    public void dance() {
        System.out.println("T1000 id dancing!");
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

    @Override
    public String toString() {
        return "ModelT1000{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", head=" + head +
                '}';
    }
}
