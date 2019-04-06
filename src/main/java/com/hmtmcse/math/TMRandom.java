package com.hmtmcse.math;

import java.util.Random;

public class TMRandom {

    public static String fourDigit(){
        Random rand = new Random();
        Integer number = rand.nextInt(9999);
        return TMFormat.leftPadding(4, number);
    }

}
