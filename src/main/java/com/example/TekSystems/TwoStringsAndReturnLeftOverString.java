package com.example.TekSystems;

import java.util.Set;
import java.util.stream.Collectors;

// Question
//You are given two strings A and B. Your task is to find and return a string representing the leftover string in A after removing all the letters that exist in string B. Return "Empty " if the output does not contain any value.
//        input1 : AABBCC
//input2 : AB
//Output : CC
//
//input1 : AABBCC
//input2 : ABCDDSD
//Output : Empty
public class TwoStringsAndReturnLeftOverString {
    public static void main(String[] args) {
        String str="AABBCC";
        String str1="AB";
        Set<Character> set=str1.chars().mapToObj(c->(char)c)
                .collect(Collectors.toSet());

        String result=str.chars().mapToObj(c->(char)c)
                .filter(v->!set.contains(v))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result.isEmpty()?"is Empty":result);

    }
}
