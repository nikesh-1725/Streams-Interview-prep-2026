package com.example.BroadCom;

import java.util.Arrays;

public class AddArraysThenReturnAsArray {
    public static void main(String[] args) {
        int[] a={9,9,9};
        int[] b={9,9,9};

        System.out.println(Arrays.toString(addArraysReturnArray(a,b)));

    }

    private static int[] addArraysReturnArray(int[] a, int[] b) {
        int i=a.length-1, j=b.length-1, carry=0;
        int[] res=new int[Math.max(a.length,b.length)+1];
        int k=res.length-1;

        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0)sum+=a[i--];
            if(j>=0)sum+=b[j--];
            res[k--]=sum%10;
            carry=sum/10;
        }
        return (k==-1)?res:Arrays.copyOfRange(res, k+1, res.length);
    }


}
