package com.lnh.leetcode.shuzu;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class Number1 {
    public static void main(String[] args) {
        int[] num={2,7,11,15};
        int a=9;
        Number1 number1=new Number1();
        int[] s=number1.twoSum(num,a);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    //方法一：暴力枚举
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    //方法二：哈希表
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (hashtable.containsKey(target - nums[i])) {
//                return new int[]{hashtable.get(target - nums[i]), i};
//            }
//            hashtable.put(nums[i], i);
//        }
//        return new int[0];
//    }
}
