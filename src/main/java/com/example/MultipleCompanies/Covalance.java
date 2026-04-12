package com.example.MultipleCompanies;

import java.util.ArrayList;
import java.util.List;

public class Covalance {
    public static void main(String[] args) {
        int[] arr={-2, 4, 6, 0, 7, -3};
        int target=6;
        List<List<Integer>> result=new ArrayList<>();
        backtracking(arr,target,0, new ArrayList<>(), result);
        System.out.println(result);
        
    }

    private static void backtracking(int[] arr, int target, int start, ArrayList<Integer> temp, List<List<Integer>> result) {

        int sum=temp.stream().mapToInt(Integer::intValue).sum();

        if(sum==target){
            result.add(new ArrayList<>(temp));
        }


        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            backtracking(arr,target,i+1,temp,result);
            temp.remove((temp.size()-1));
        }



    }
}
