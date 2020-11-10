package com.lnh.leetcode.array;

import java.util.Arrays;

public class Number31 {
    public static void main(String[] args) {
        int[] num={1,4,3,7,5,6,7,4,3,2,1};
        Number31 number31=new Number31();
        number31.nextPermutation(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<2) return;
        boolean flag=false;
        for(int i=nums.length-2;i>=0;--i){
            if (nums[i+1]<=nums[i]){
                continue;
            }
            flag=true;
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int t=nums[j];
            nums[j]=nums[i];
            nums[i]=t;
            Arrays.sort(nums,i+1,nums.length);
            break;
        }
        if(!flag){
            Arrays.sort(nums);
        }
    }
}
