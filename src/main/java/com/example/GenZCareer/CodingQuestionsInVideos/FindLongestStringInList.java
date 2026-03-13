package com.example.GenZCareer.CodingQuestionsInVideos;

import java.util.*;
import java.util.stream.Collectors;

public class FindLongestStringInList {
    public static void main(String[] args) {
        List<String> str=Arrays.asList("nikesh","ni","nike");

        System.out.println(str.stream().max(Comparator.naturalOrder()).orElse(""));
        System.out.println(str.stream().collect(Collectors.joining(",")));


    }
}
