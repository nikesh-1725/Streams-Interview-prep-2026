package com.example.MultipleCompanies;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        Map<Integer, Integer> map=new HashMap<>();
        map.put(3,1);
        map.put(2,2);
        map.put(1,4);
        map.put(0,0);

        Map<Integer, Integer> result1 =  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e2,
                        LinkedHashMap::new));
        System.out.println(result1);



        Map<Integer, Integer> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(result);
    }
}
