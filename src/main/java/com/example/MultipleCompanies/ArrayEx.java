package com.example.MultipleCompanies;

public class ArrayEx {
    public static void main(String[] args) {
        int[] stock={7,6,4,3,1};
        findMaxProfit(stock);
    }

    private static void findMaxProfit(int[] stock) {

        int minPrice=Integer.MAX_VALUE;
        int max_profit=0;

        for(int price: stock){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                max_profit=Math.max(max_profit,price-minPrice);
            }

        }
        System.out.println(max_profit);
    }
}
