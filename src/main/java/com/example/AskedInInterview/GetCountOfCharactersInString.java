package com.example.AskedInInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetCountOfCharactersInString {
    private static Map<Character, Integer> map;

    public static void main(String[] args) {
        String str = "HelloWorld";

//        System.out.println(str.chars().count()); Whole characters count

        Map<Character, Long> map = str.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);




        // We use LinkedHashMap::new to preserve the order of insertion, if you remove that
        // still it works but the order will be random

        // Its up to us to show the result.
    }
}
