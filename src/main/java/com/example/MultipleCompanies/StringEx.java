package com.example.MultipleCompanies;

public class StringEx {
    public static void main(String[] args) {
        String s = "    m      ";
        lengthOfLastWord(s.trim());
    }

    private static void lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;

        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
}
