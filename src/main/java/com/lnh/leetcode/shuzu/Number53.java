package com.lnh.leetcode.shuzu;

public class Number53 {
    public static void main(String[] args) {
        int[] num={-2,1,-3,4,-1,2,1,-5,4};
        Number53 number53=new Number53();
        System.out.println(number53.maxSubArray(num));
    }
    //动态规划yyds
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int i=0;i<nums.length;i++) {
            int x=nums[i];
            if(pre>0){
                pre=pre+x;
            }else{
                pre=x;
            }
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
