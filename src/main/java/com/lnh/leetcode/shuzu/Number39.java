package com.lnh.leetcode.shuzu;

import java.util.ArrayList;
import java.util.List;

public class Number39 {
    public static void main(String[] args) {
        int[] num={2,3,6,7};
        int a=7;
        Number39 number39=new Number39();
        List<List<Integer>> s=number39.combinationSum(num,a);
        System.out.println(s);
    }
    //回溯+递归 看不懂
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }
}
