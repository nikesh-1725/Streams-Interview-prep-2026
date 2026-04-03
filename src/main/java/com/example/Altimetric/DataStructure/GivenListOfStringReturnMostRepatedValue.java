package com.example.Altimetric.DataStructure;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GivenListOfStringReturnMostRepatedValue {
    public static void main(String[] args) {
        List<String> colors = List.of(
                "Blue","yellow","Green","Blue","purple","yellow","Blue"
        );

        System.out.println(colors.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null));

    }
}
