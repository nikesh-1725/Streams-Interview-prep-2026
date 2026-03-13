package com.example.GenZCareer.BasicJavaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsInStringUsingHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        String str="I am Nikesh from Hyderabad Nikesh";
        String[] words=str.split("\\s+");
//        Arrays.stream(words).forEach(a-> System.out.println(a));
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        map.forEach((key, val)-> System.out.println(key+" "+val));
    }
}
