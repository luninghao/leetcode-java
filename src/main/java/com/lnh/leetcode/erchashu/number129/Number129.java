package com.lnh.leetcode.erchashu.number129;

//求根到叶子节点数字之和
public class Number129 {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if(root.left==null||root.right==null){
            return sum;
        } else{
            return dfs(root.left,sum)+dfs(root.right,sum);
        }
    }
}
