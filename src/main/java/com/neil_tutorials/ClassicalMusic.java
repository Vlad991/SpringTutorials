package com.neil_tutorials;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

//    public static ClassicalMusic getClassicalMusic() {  //for scope Singleton spring do getClassicalMusic() method only one time, and saves this object
//        return new ClassicalMusic();
//    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Classical Melody";
    }
}
