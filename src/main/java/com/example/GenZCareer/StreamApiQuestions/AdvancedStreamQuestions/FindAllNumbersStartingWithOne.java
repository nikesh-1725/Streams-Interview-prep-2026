package com.example.GenZCareer.StreamApiQuestions.AdvancedStreamQuestions;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersStartingWithOne {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,32,101,345,56,21,167);
        System.out.println(list.stream().map(String::valueOf).filter(s->s.startsWith("1")).toList());

        int[] arr={1,2,67,876,12,1910,185};
        System.out.println(Arrays.stream(arr).boxed().map(String::valueOf).filter(s->s.startsWith("1")).toList());
        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).filter(s->s.startsWith("1")).toList());
    }
}
