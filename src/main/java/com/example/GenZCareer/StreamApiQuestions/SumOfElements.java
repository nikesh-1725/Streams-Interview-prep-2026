package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5);

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
