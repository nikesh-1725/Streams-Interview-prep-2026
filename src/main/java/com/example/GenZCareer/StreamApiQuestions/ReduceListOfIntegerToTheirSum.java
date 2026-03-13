package com.example.GenZCareer.StreamApiQuestions;

import java.util.List;

public class ReduceListOfIntegerToTheirSum {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        System.out.println(list.stream().reduce(0,Integer::sum));
    }
}
