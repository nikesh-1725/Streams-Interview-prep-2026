package com.example.Epam;

public class SlidingWindowProblem {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3, windowSum=0;
        int[] result=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            windowSum+=arr[i];

            if(i>=k){
                windowSum-=arr[i-k];
            }
            result[i]=windowSum;
        }

        for(int i:result){
            System.out.print(" "+i);
        }

    }
}
