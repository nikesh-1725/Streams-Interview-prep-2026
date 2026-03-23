package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomCollection {
    public static void main(String[] args) {
        List<String> words=Arrays.asList("apple", "banana","cherry", "orange","ani","apple");
        TreeSet<String> tree=new TreeSet<>(words);
        System.out.println(tree);
        //Print the set of values from the given range
        System.out.println(IntStream.range(2,10).boxed().collect(Collectors.toList()));

        int[] arr={1,2,4,5,8};
        System.out.println(Arrays.stream(arr).boxed().min(Comparator.comparing(t->t)).orElse(0));
        System.out.println(Arrays.stream(arr).count());

    }
}
