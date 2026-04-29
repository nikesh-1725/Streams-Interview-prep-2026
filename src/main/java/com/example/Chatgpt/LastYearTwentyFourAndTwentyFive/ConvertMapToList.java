package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import java.util.HashMap;
import java.util.Map;

public class ConvertMapToList {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);

        // othere way to declare the map
        Map<String, Integer> map1=new HashMap<>(){{
            put("Hello",1);
            put("World",2);
            put("Nikesh",3);
        }};


        System.out.println(map.entrySet().stream().toList());

        System.out.println(map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry->entry.getKey()+"="+entry.getValue()).toList());
    }
}
