package com.lnh.leetcode.shuzu;

public class Number26 {
    public static void main(String[] args) {
        int[] num={0,0,1,1,1,2,2,3,3,4};
        Number26 number26=new Number26();
        int s=number26.removeDuplicates(num);
        System.out.println(s);
    }
    //方法一：暴力枚举
//    public int removeDuplicates(int[] nums) {
//        int n=nums.length;
//        for(int i=0;i<n-1;i++){
//            if(nums[i]==nums[i+1]){
//                for(int j=i+1;j<n-1;j++){
//                    nums[j]=nums[j+1];
//                }
//                n--;
//                i--;
//            }
//        }
//        return n;
//    }
    //方法二：双指针法
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
