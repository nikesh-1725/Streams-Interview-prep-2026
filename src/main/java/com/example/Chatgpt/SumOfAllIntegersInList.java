package com.example.Chatgpt;

import java.util.Arrays;
import java.util.List;

public class SumOfAllIntegersInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);

        System.out.println(list.stream().mapToInt(Integer::valueOf).sum());

        System.out.println(list.stream().reduce(Integer::sum).orElse(0));

        System.out.println(list.stream().peek(System.out::println));

    }
}
