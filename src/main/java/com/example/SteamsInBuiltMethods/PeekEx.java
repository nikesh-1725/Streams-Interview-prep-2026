package com.example.SteamsInBuiltMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PeekEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,5,6,8);
        System.out.println(list.stream().peek(System.out::println).filter(a->a%2==0).toList());
    }

}
