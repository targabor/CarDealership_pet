package com.rofa.cardealership;

public class Math {

    public static int sum(int a, int b){
        return a+b;
    }

    public static boolean isNumber(String nNumber){

        String regex = "\\d+";
        return nNumber.matches(regex);

    }
}
