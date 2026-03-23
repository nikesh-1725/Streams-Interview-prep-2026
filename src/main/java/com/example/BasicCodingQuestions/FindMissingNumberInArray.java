package com.example.BasicCodingQuestions;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,5}; int start=a[0];
        for (int i=0;i<a.length;i++){
            if(start==a[i]){
                start++;
            }

        }
        System.out.println(start);
    }
}
