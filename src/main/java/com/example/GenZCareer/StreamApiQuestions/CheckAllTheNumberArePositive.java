package com.example.GenZCareer.StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckAllTheNumberArePositive {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,1,4,8,6);
        System.out.println(list.stream().allMatch(n->n>0));
    }
}
