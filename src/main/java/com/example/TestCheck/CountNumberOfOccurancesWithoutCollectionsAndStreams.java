package com.example.TestCheck;

public class CountNumberOfOccurancesWithoutCollectionsAndStreams {
    public static void main(String[] args) {
        String str="abcab";

        int[] num=new int[26];

        for(int i=0;i<str.length();i++){
            num[str.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(num[i]!=0){
//                char ch= (char) (i + 'a');
                System.out.println((char)(i+'a')+"="+num[i]);
            }
        }
    }
}
