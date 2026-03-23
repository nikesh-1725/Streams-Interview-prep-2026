package com.example.GreeksForGreeks;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstHalfUpperCaseAndNextHalfLowerCase {
    public static void main(String[] args) {
        String str="nikeshreddy";
        System.out.println(IntStream.range(0,str.length()).mapToObj(s->s<str.length()/2?String.valueOf(str.charAt(s)).toUpperCase():String.valueOf(str.charAt(s)).toLowerCase()).collect(Collectors.joining())

        );
    }
}
