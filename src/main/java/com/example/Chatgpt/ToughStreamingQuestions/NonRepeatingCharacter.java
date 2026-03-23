package com.example.Chatgpt.ToughStreamingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str="niekshesh";

        System.out.println(str.chars().mapToObj(s->(char)s)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                        .toList()
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
        );
    }
}
