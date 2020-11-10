package com.lnh.leetcode.shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number75 {
    public static void main(String[] args) {
        int[] num={2,0,2,1,1,0};
        Number75 number75=new Number75();
        number75.sortColors(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
    //这也行？
//    public void sortColors(int[] nums) {
//        Arrays.sort(nums);
//    }
    //单指针
    public void sortColors(int[] nums){
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int t=nums[i];
                nums[i]=nums[s];
                nums[s]=t;
                s++;
            }
        }
        for(int i=s;i<nums.length;i++){
            if(nums[i]==1){
                int t=nums[i];
                nums[i]=nums[s];
                nums[s]=t;
                s++;
            }
        }
    }
}
