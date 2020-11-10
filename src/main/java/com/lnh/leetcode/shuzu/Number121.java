package com.lnh.leetcode.shuzu;

public class Number121 {
    public static void main(String[] args) {
        int[] num={7,1,5,3,6,4};
        Number121 number121=new Number121();
        int s=number121.maxProfit(num);
        System.out.println(s);
    }
    //
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
