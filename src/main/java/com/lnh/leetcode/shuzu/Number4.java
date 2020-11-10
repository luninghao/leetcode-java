package com.lnh.leetcode.shuzu;

public class Number4 {
    public static void main(String[] args) {
        int[] num={1,8,6,2,5,4,8,3,7};
        Number4 number4=new Number4();
        int s=number4.maxArea(num);
        System.out.println(s);
    }
    //方法一：暴力枚举
//    public int maxArea(int[] height) {
//        int max=0,sum;
//        for(int i=0;i<height.length-1;i++){
//            for(int j=i+1;j<height.length;j++){
//                sum=(j-i)*Math.min(height[i],height[j]);
//                if(sum>max){
//                    max=sum;
//                }
//            }
//        }
//        return max;
//    }
    //方法二：双指针法
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return ans;
    }
}
