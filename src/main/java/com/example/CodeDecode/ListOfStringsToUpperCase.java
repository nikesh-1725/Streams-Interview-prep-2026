package com.example.CodeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsToUpperCase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("nikesh","Naresh");

        System.out.println(list.stream().map(String::toUpperCase).toList());
    }
}
