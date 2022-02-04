package com.calculator.cal.calculator;

import org.springframework.stereotype.Component;

@Component
public class Operations {
    private int value1, value2;

//    public Operations(int value1, int value2) {
//        this.value1 = value1;
//        this.value2 = value2;
//    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public float sum(){
        return value1+value2;
    }

    public float difference(){
        return value1-value2;
    }

    public float product(){
        return value1*value2;
    }

    public float quotient(){
        return value1/value2;
    }

    public float reminder(){
        return value1%value2;
    }
}
