package com.example.GenZCareer.StreamApiQuestions.AdvancedStreamQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String str="Hi I am Nikesh from Hyderabad I Nikesh";

        // First non repeating String value in the given String

        System.out.println(Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("0"));

        // First Non Repeating Character in the given String

        System.out.println(str.chars().mapToObj(s->Character.toLowerCase((char)s))
                        .collect(Collectors.groupingBy(t->t, LinkedHashMap::new, Collectors.counting()))
                                .entrySet()
                                        .stream().filter(e->e.getValue()==1)
                        .map(m->m.getKey())
                                .findFirst().orElse(null));


        System.out.println(
                str.chars().mapToObj(c->(char)c)
                .filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
//                        .forEach(System.out::println);
                .findFirst().orElse(null));

    }
}
