package com.example.GenZCareer.StreamApiQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,34,5,6);
        System.out.println(list.stream().max(Comparator.naturalOrder()).orElse(0));


    }
}
