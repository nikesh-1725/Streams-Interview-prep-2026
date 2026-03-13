package com.example.GenZCareer.BasicJavaQuestions;

import java.util.Iterator;
import java.util.Map;

public class IterateHashMapUsingWhileAndAdvancedForLoop {
    public static void main(String[] args) {
        Map<String, Integer> map=Map.of("Nikesh",1,"Naveen",2,"Naresh",3);

        System.out.println("Example using Advanced forloop");
        // Using advance for-loop
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Example using while loop");

        // Using while loop
        Iterator<Map.Entry<String, Integer>> iterator=map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
