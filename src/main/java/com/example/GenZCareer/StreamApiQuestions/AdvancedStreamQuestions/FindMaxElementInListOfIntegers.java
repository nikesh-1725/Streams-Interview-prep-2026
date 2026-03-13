package com.example.GenZCareer.StreamApiQuestions.AdvancedStreamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElementInListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,5,67,8,9,10);
        int max=list.stream().max(Integer::compare).get();
        System.out.println(max);

        System.out.println(list.stream().max(Comparator.naturalOrder()).orElse(0));
    }
}
