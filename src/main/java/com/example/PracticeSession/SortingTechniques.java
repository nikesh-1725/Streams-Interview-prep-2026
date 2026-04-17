package com.example.PracticeSession;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingTechniques {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Nikesh", "Hello","Hi");
        System.out.println(list.stream().sorted(Comparator.comparing(String::length)).toList());
//        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
