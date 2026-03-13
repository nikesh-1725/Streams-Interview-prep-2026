package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class SortListInAscendingOrder {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,4,5,3,2);

        System.out.println(list.stream().sorted().toList());
    }
}
