package com.lnh.leetcode.shuzu;

public class Number27 {
    public static void main(String[] args) {
        int[] num={0,1,2,2,3,0,4,2};
        int a=2;
        Number27 number27=new Number27();
        int s=number27.removeElement(num,a);
        System.out.println(s);
    }
    //双指针法
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
