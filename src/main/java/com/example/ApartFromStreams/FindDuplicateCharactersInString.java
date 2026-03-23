package com.example.ApartFromStreams;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String str="nikeshnik";
        Set<Character> set=new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for(int i=0;i<str.length();i++){

            if(!set.add(str.charAt(i))){
                duplicates.add(str.charAt(i));
            }
        }
        System.out.println(duplicates);
    }
}
