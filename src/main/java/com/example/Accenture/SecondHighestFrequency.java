package com.example.Accenture;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class SecondHighestFrequency {
    public static void main(String[] args) {
        String input = "aaabbccccddeee";

        Optional<Map.Entry<Character, Long>> result =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                        .skip(1) // skip highest
                        .findFirst();

        result.ifPresent(e ->
                System.out.println("Second highest repeating char: "
                        + e.getKey() + " -> " + e.getValue()));
    }
}
