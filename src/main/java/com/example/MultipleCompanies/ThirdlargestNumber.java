package com.example.MultipleCompanies;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdlargestNumber {
    public static void main(String[] args) {
        int[] arr = { 100,14, 46, 47, 94, 98, 52, 86, 36, 94, 89,96};
        int first=0, third=0, high=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length-1;j++) {
//                high=arr[j];
//                if (arr[i] > high){
//                    high=arr[i];
//                }
//            }
//        }

        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).limit(1).findFirst().get());
    }
}
