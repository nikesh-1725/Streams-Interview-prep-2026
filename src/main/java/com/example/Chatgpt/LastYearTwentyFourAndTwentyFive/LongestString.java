package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "strawberry", "kiwi");

        System.out.println(words.stream().max(Comparator.comparing(String::length)).get());
    }

}
