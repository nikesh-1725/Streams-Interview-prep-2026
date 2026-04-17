package com.example.Encora;

public class ThirdHighest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("No third highest number");
        } else {
            System.out.println("Third highest number: " + third);
        }
    }
}
