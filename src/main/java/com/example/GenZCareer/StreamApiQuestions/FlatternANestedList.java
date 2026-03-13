package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class FlatternANestedList {
    public static void main(String[] args) {
        List<List<Integer>> list= Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        List<Integer> result=list.stream().flatMap(List::stream).toList();
        System.out.println(result);
    }
}
