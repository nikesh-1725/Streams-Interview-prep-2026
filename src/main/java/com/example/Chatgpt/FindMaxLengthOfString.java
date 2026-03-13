package com.example.Chatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxLengthOfString {
    public static void main(String[] args) {
        String str="Hi I am Nikesh";

        Optional<String> result=Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length));

        System.out.println(result.get().length());


    }
}
