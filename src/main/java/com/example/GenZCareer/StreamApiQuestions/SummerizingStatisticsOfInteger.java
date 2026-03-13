package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SummerizingStatisticsOfInteger {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,7);
        System.out.println(list.stream().mapToInt(Integer::intValue).summaryStatistics());
//        System.out.println(IntStream.range(0,list.size()).summaryStatistics());
    }
}
