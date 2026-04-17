package com.example.Encora;


// They asked to solve this without predefined methods or using streams
public class ThirdHighestNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,8,9};
        thirdHighestSalaryWithBruteForce(arr);
        System.out.println("Third Highest Number: "+arr[2]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] arr1={1,2,4,5,6,8,9};
        System.out.println("Just To Find Third Highest Number: "+JustToFindThirdHighestSalary(arr1));


    }

    private static int JustToFindThirdHighestSalary(int[] arr1) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;


        for(int num:arr1){

            if(num>first){
                third=second;
                second=first;
                first=num;
            }
            else if(num>second && num != first){
                third=second;
                second=num;
            }
            else if(num>third && num !=second && num !=first){
                third=num;
            }

        }
        return third;
    }

    private static void thirdHighestSalaryWithBruteForce(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            for(int j=i+1;j<arr.length-1;j++){
                if(val < arr[j]){
                    arr[i]=arr[j];
                    arr[j]=val;
                    val=arr[i];
                }
            }

        }
    }
}
