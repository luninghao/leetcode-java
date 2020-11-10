package com.lnh.leetcode.shuzu;

public class Number55 {
    public static void main(String[] args) {
        int[] num={2,3,1,1,4};
        Number55 number55=new Number55();
        System.out.println(number55.canJump(num));
    }
    //贪心算法
    public boolean canJump(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(i<=r){
                r=Math.max(r,i+nums[i]);
                if(r>=nums.length-1){
                    return true;
                }
            }

        }
        return false;
    }
}
