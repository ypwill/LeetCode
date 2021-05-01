package com.wyp.LeetCode;

/**
 * @author WYP
 * @date 2021-04-30 23:30
 */
public class T02 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int sum=0;
        for (int i=0; i < prices.length - 1; i++){
            if (prices[i] < prices[i+1]){
                sum = (prices[i+1] - prices[i]) + sum;
            }
        }
        return sum;
    }

}
