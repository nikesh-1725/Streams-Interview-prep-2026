package com.example.Chatgpt.LastYearTwentyFourAndTwentyFive;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionExAndOvercomeEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,4));

//        concurrentModificationExceptionEx(list);
        overComeThisException(list);


    }

        private static void overComeThisException(List<Integer> list) {
            CopyOnWriteArrayList<Integer> copy=new CopyOnWriteArrayList<>(list);
            for (Integer num : copy) {
                list.add(5);
            }
            System.out.println(list);
        }

    private static void concurrentModificationExceptionEx(List<Integer> list) {

        for (Integer num : list) {
            list.add(5); // 💥 ConcurrentModificationException
        }
    }
}
