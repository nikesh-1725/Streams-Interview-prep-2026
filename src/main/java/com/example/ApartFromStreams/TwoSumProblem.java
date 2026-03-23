package com.example.ApartFromStreams;

import java.util.*;

public class TwoSumProblem {
    public static void main(String[] args) {
        Map<Integer, Integer> map=new HashMap<>();
        int[] arr={1,10,8,7,2},result={};
        int target=10;
        for(int i=0;i<arr.length;i++){
            int val=target-arr[i];
            if(map.containsKey(val)){
                result=new int[]{map.get(val), i};
                break;
            }
            map.put(arr[i],val);
        }

        System.out.println(Arrays.stream(result).boxed().toList());

    }
}
