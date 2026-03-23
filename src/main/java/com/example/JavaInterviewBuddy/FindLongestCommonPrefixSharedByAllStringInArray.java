package com.example.JavaInterviewBuddy;


//If there is no common Prefix share empty String
// Your task is to find the longest common prefix shared by all the strings in the array
public class FindLongestCommonPrefixSharedByAllStringInArray {
    public static void main(String[] args) {
        String[] words={"abc","abcd","abcde","ab","abcd","abcdef"};
        String result=findLongestCommonPrefix(words);
        System.out.println(result);
    }

    private static String findLongestCommonPrefix(String[] words) {

        if(words == null || words.length==0){
            return "";
        }
        if(words.length==1){
            return words[0];
        }
        String first=words[0];
        for(int index=0;index<first.length();index++){
            char currrentChar=first.charAt(index);
            for (int i=1;i<words.length;i++){
                if(index >= words[i].length() || words[i].charAt(index) != currrentChar){
                    return first.substring(0,index);
                }
            }
        }
        return "";
    }
}
