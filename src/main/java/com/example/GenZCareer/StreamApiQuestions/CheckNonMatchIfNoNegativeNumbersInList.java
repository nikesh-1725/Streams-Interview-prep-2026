package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckNonMatchIfNoNegativeNumbersInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,1,4,8,6);
        boolean nonNegative=list.stream().noneMatch(n->n<0);
        System.out.println(nonNegative);
    }
}
