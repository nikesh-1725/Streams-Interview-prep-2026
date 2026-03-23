package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequestElementInString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
   String result=words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(result);

        System.out.println(words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
