package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class UsingPeekExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5);

        List<Integer> result=list.stream().peek(System.out::println).toList();
        System.out.println(result);
    }
}
