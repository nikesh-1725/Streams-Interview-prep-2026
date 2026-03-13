package com.example.GenZCareer.StreamApiQuestions;

import java.util.*;

public class ListOfNamesToUpperCase {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("nikesh", "hello");

        // :: Method Reference
        System.out.println(list.stream().map(String::toUpperCase).toList());
    }
}
