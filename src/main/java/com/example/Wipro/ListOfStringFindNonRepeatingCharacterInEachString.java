package com.example.Wipro;

import  java.util.*;
import java.util.stream.Collectors;

public class ListOfStringFindNonRepeatingCharacterInEachString {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Nikeshnik","Hello","World");
        System.out.println(list.stream().map(s->s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(t->t, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m->m.getValue()==1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining())


        ).toList());


    }
}
