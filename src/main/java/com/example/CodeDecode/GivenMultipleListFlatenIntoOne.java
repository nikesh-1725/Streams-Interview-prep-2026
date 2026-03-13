package com.example.CodeDecode;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GivenMultipleListFlatenIntoOne {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5);
        List<Integer> list1=Arrays.asList(6,7,8,9);

        List<Integer> result=Arrays.asList(list,list1).stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(result);

        System.out.println(Stream.of(list,list1).flatMap(Collection::stream).toList());

        System.out.println(Stream.concat(list.stream(),list1.stream()).toList());

        System.out.println(Stream.of(list,list1).flatMap(Collection::stream).toList());

     }
}
