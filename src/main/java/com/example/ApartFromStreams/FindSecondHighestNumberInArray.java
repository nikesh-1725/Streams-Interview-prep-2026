package com.example.ApartFromStreams;

public class FindSecondHighestNumberInArray {
    public static void main(String[] args) {
        int high=Integer.MIN_VALUE, secondHigh=Integer.MIN_VALUE;
        int[] nums={2,6,7,8,1,9};
        for(int num:nums)
            if(num>high){
                secondHigh=high;
                high=num;

        }
        else if(num>secondHigh && num!=high){
            secondHigh=num;
            }
    }
}
