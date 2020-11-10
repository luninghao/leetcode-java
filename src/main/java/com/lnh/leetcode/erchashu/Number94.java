package com.lnh.leetcode.erchashu;

import java.util.ArrayList;
import java.util.List;

public class Number94 {
    public static void main(String[] args) {
        Number94 number94=new Number94();
        TreeNode root=number94.init();
        number94.inorderTraversal(root);
    }

    public TreeNode init(){
        TreeNode C=new TreeNode(3,null,null);
        TreeNode B=new TreeNode(2,C,null);
        TreeNode A=new TreeNode(1,null,B);
        return A;
    }
    //二叉树的中序遍历 递归实现
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if(root==null) {
            return;
        }
        //按照 左-打印-右的方式遍历
        dfs(res,root.left);
        res.add(root.val);
        System.out.println(root.val);
        dfs(res,root.right);
    }
}
