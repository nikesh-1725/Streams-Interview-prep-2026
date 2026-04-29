package com.example.CodeDecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GiveMeSummerizingOfIntegerArray {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,4,5,7,7,8,9);

        System.out.println(list.stream().max(Comparator.naturalOrder()).get());

        System.out.println(list.stream().collect(Collectors.summarizingInt(Integer::intValue)));

        System.out.println(list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax());
    }
}
