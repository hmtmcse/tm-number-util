package com.hmtmcse.math;

public class TMFormat {

    public static void main(String[] args) {
        System.out.println(String.format("%04d", 12));
    }

    public static String leftPadding(Integer padding, Integer number){
        return String.format("%0" + padding + "d", number);
    }

}
