package com.example.Epam;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class SortByLengthAndThenSortByFirstValueInString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "pavel","mikalai","donald","onac","ragav","maset","ahncy"
        );

        System.out.println(names.stream().sorted(Comparator.comparing(String::length).thenComparing(s->s.charAt(0))).collect(Collectors.joining(",")));

    }
}
