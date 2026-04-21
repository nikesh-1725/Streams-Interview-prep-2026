package com.example.BroadCom;

import java.util.ArrayList;
import java.util.List;

public class GetTheTargetValues {
    public static void main(String[] args) {
        int[] arr={-2, 4, 6, 0, 7, -3};
        int target=6;
        List<List<Integer>> result=new ArrayList<>();
        getTargetReachingValues(arr, target, 0, result, new ArrayList<>());
        System.out.println(result);
    }

    private static void getTargetReachingValues(int[] arr, int target, int start, List<List<Integer>> result, List<Integer> temp) {

        int sum=temp.stream().mapToInt(Integer::intValue).sum();

        if(sum==target){
            result.add(new ArrayList<>(temp));
        }
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            getTargetReachingValues(arr, target, i+1, result, temp);
            temp.remove((temp.size())-1);

        }


    }
}
