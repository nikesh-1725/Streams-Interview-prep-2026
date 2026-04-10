package com.example.MultipleCompanies;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveArray {
    public static void main(String[] args) {
        int[] arr={11,12,13,0,1,2,77,78,79,80,81};
        int result=longestConsecutiveNumber(arr);
        System.out.println(result);
        
        
    }

    private static int longestConsecutiveNumber(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int n:arr) set.add(n);
        int max=0;
        int start=0;
        for(int v:arr){
            if(!set.contains(v-1)) {
                int curr = v;
                int count = 1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }

//                max=Math.max(max,count);
                if(count>max){
                    max=count;
                    start=v;
                }

            }


        }
        System.out.println();
        int[] result=new int[max];
        for(int i=0;i<max;i++){
            result[i]=start+i;
        }

        return max;
    }
}
