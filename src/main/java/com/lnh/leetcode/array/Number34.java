package com.lnh.leetcode.array;

public class Number34 {
    public static void main(String[] args) {
        int[] num={5,7,7,8,8,8,10};
        int a=8;
        Number34 number34=new Number34();
        int[] s=number34.searchRange(num,a);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }
    //二分查找：在排序数组中查找元素的第一个位置和最后一个位置
    public int[] searchRange(int[] nums, int target) {
        int[] range={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                range[0]=i;
                break;
            }
        }
        if(range[0]==-1){
            return range;
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                range[1]=j;
                break;
            }
        }
        return range;
    }
}
