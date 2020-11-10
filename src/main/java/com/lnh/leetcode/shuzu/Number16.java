package com.lnh.leetcode.shuzu;

import java.util.Arrays;

public class Number16 {
    public static void main(String[] args) {
        int[] num={-1,2,1,-4};
        int a=1;
        Number16 number16=new Number16();
        int s=number16.threeSumClosest(num,a);
        System.out.println(s);
    }
    //排序和双指针
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int start=i+1,end=nums.length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum>target){
                    end--;
                }
                else if(sum<target){
                    start++;
                }
                else {
                    return ans;
                }
            }
        }
        return ans;
    }
}
