package com.lnh.leetcode.shuzu;

public class Number33 {
    public static void main(String[] args) {
        int[] num={4,5,6,7,0,1,2};
        int a=0;
        Number33 number33=new Number33();
        System.out.println(number33.search(num,a));
    }
    //不知道为什么这么简单？？？ 时间复杂度有要求：log(n)
//    public int search(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target) return i;
//        }
//        return -1;
//    }
    //标准解法：二分查找
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            } else{
                return -1;
            }
        }
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[0]){
                if(nums[0]<=target && target<nums[mid]){
                    r=mid-1;
                } else{
                    l=mid+1;
                }
            } else{
                if(nums[mid]<target && target<=nums[nums.length-1]){
                    l=mid+1;
                } else{
                    r=mid-1;
                }
            }

        }
        return -1;
    }
}
