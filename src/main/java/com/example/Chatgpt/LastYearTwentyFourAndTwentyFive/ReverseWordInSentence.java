package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import java.util.*;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java Streams are powerful";
        System.out.println(Arrays.stream(sentence.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" ")));

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 6, 7, 8);

        System.out.println(Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList()));
    }
}
