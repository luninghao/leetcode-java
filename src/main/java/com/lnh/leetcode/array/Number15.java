package com.lnh.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number15 {
    public static void main(String[] args) {
        int[] num={-1, 0, 1, 2, -1, -4};
        List<List<Integer>> s=threeSum(num);
        System.out.println(s);
    }
    //方法一：数组遍历
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans=new ArrayList();
        int len=nums.length;
        if(nums==null || len < 3) {
            return ans;
        }
        Arrays.sort(nums);  //排序
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                break; //数组升序，第一个数大于0，则三数之和必定大于0
            }
            if(i>0 && nums[i]==nums[i-1]) {
                continue; //去重
            }
            int l=i+1;
            int r=len-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l] == nums[l+1]) {
                        l++; // 去重
                    }
                    while (l<r && nums[r] == nums[r-1]) {
                        r--; // 去重
                    }
                    l++;
                    r--;
                }
                else if(sum<0) {
                    l++;
                }
                else if(sum>0) {
                    r--;
                }
            }
        }
        return ans;
    }
}
