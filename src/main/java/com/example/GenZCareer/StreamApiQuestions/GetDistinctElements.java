package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class GetDistinctElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,1,4,6,7);
        System.out.println(list.stream().distinct().toList());
    }
}
