package com.example.MediumWebsite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatInStreams {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5);
        List<Integer> list1=Arrays.asList(6,7,8,9);

        System.out.println(Stream.concat(list.stream(),list1.stream()).toList());

    }
}
