package com.example.CodeDecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListOfStringLengthWithRepetativeCount {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("nikesh","naresh");

        System.out.println(list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
    }
}
