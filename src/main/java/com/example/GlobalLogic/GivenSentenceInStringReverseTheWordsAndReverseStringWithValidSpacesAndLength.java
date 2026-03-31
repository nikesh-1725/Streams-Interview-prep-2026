package com.example.GlobalLogic;

public class GivenSentenceInStringReverseTheWordsAndReverseStringWithValidSpacesAndLength {
    public static void main(String[] args) {
        String str="Ramu is a good boy";
//        Expected "yobd oo g asiu maR"
        char[] arr=str.toCharArray();
        int left=0, right=arr.length-1;
        for(char c:arr){
            System.out.print(c+" ");
        }

        while(left<right){
            if(arr[left]== ' '){
                left++;
            }
            else if(arr[right]  ==' '){
                right--;
            }
            else {
                char temp=arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(arr);
    }
}
