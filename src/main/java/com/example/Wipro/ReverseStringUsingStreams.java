package com.example.Wipro;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingStreams {
    public static void main(String[] args) {
        String str="nikesh";
        System.out.println(IntStream.range(0,str.length()).mapToObj(s->str.charAt(str.length()-s-1)).map(String::valueOf).collect(Collectors.joining()));
    }
}
