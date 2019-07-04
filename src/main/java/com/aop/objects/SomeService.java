package com.aop.objects;

import com.aop.exeptions.MyException;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

    public int getIntValue() {
        System.out.println("SomeService.getIntValue()");
        return 5;
    }

    public double getDoubleValue() {
        System.out.println("SomeService.getDoubleValue()");
        return 5.6;
    }

    public int getFractionOfDivision(int dividend, int divider) throws MyException {
        System.out.println("SomeService.getFractionOfDivision()");
        return dividend/divider;
    }
}
