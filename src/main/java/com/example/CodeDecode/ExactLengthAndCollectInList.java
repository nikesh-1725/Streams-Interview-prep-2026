package com.example.CodeDecode;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExactLengthAndCollectInList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("nikesh", "naresh");

        System.out.println(list.stream().map(String::length).toList());
        System.out.println(list.stream().collect(Collectors.joining(",","{","}")));

    }
}
