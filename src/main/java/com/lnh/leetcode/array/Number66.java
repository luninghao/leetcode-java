package com.lnh.leetcode.array;

public class Number66 {
    public static void main(String[] args) {
        int[] num={9,9,9};
        Number66 number66=new Number66();
        int[] s=number66.plusOne(num);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            } else{
                digits[i]++;
                return digits;
            }
        }
        //如果所有位都是进位，则长度+1
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

}
