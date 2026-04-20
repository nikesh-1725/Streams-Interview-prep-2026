package com.example.TekSystems;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfCitiesCountOccurancesCaseInsensitively {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("New York", "seattle", "Chicago", "HOUSTON", "NEW YORK");

        Map<String, Long> map=list.stream().map(String::toLowerCase).collect(Collectors.groupingBy(t->t, LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);

    }
}
