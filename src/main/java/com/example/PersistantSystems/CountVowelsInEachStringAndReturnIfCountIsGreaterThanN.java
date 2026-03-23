package com.example.PersistantSystems;

import java.util.*;

public class CountVowelsInEachStringAndReturnIfCountIsGreaterThanN {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("nikeissh","naveen","hello","world");
        System.out.println(list.stream().filter(str->str.chars()
                        .filter(c->"aeiouAEIOU".indexOf(c)!=-1)
                        .count()>2
                )
                .toList()
        );
    }
}
