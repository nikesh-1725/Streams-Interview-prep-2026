package com.example.Epam;

import java.util.Arrays;
import java.util.*;

public class FindDuplicatesInListUsingStreams {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,1,3);
        Set<Integer> set=new HashSet<>();

        System.out.println(list.stream().filter(s->!set.add(s)).distinct().toList());
    }
}
