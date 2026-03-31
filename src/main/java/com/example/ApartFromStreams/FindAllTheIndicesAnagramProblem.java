package com.example.ApartFromStreams;

public class FindAllTheIndicesAnagramProblem {

    public static void main(String[] args) {
        int[] result=new int[26];
        boolean val=true;
        String s="silent", p="listen";
        for(Character f: s.toCharArray()){
            result[f-'a']++;
        }
        for(int h:result){
            System.out.print(h+" ");
        }
        System.out.println();
        for(Character g:p.toCharArray()){
            result[g-'a']--;
        }
        for(int h:result){
            System.out.print(h+" ");
        }

        for(int t:result){
            if(t!=0){
                val=false;
            }
        }
        System.out.println(val);
    }
}
