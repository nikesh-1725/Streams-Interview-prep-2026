package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,1,4,8,6);
        System.out.println(list.stream().collect(Collectors.toSet()));
    }


}
