package com.lnh.leetcode.array;

public class Number35 {
    public static void main(String[] args) {
        int[] num={1,3,5,6};
        int a=7;
        Number35 number35=new Number35();
        System.out.println(number35.searchInsert(num,a));
    }
    //方法一：超简单的遍历
//    public int searchInsert(int[] nums, int target) {
//        int i;
//        if(nums[0]>target) return 0;
//        for(i=0;i<nums.length;i++){
//            if(nums[i]>=target){
//                return i;
//            }
//        }
//        return i;
//    }
    //方法二：二分查找
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<target) {
                l = mid + 1;
            }
            else {
                r=mid-1;
            }
        }
        return l;
    }
}
