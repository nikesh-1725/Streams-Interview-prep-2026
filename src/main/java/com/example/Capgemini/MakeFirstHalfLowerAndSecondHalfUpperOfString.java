package com.example.Capgemini;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MakeFirstHalfLowerAndSecondHalfUpperOfString {
    public static void main(String[] args) {
        String str="Hello World";

        String result=IntStream.range(0,str.length())
                .mapToObj(i->i<((str.length()+1)/2)?(Character.toLowerCase(str.charAt(i))):Character.toUpperCase(str.charAt(i)))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);














        String result1=IntStream.range(0,str.length())
                .mapToObj(i->i<(str.length()+1)/2?Character.toLowerCase(str.charAt(i)):Character.toUpperCase(str.charAt(i)))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result1);
    }
}
