package com.example.ApartFromStreams;

public class RemoveAllWhiteSpacesfromaStringWithoutReplaceMethod {
    public static void main(String[] args) {
        String str="ni ke sh re dd y";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        System.out.println(str.strip());
    }
}
