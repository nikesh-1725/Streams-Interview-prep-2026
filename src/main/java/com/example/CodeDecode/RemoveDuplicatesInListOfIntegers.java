package com.example.CodeDecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,4,3,1,5);

        System.out.println(list.stream().distinct().toList());

        System.out.println(list.stream().collect(Collectors.summarizingInt(Integer::intValue)));
    }
}
