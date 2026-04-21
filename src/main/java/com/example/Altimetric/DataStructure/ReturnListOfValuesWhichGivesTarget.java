package com.example.Altimetric.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ReturnListOfValuesWhichGivesTarget {
    public static void main(String[] args) {
        int[] arr={6,9,2,1,8};
        int target=9;

        List<List<Integer>> result=new ArrayList<>();
        backTracking(arr, target,0, new ArrayList<>(),result);
        System.out.println(result);
    }

    private static void backTracking(int[] arr, int target, int start, ArrayList<Integer> temp, List<List<Integer>> result) {

        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(arr[i]>target) continue;

            temp.add(arr[i]);
            backTracking(arr, target-arr[i], i+1, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}
