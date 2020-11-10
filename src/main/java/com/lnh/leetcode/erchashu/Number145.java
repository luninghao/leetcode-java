package com.lnh.leetcode.erchashu;

import java.util.ArrayList;
import java.util.List;

public class Number145 {
    public static void main(String[] args) {
        Number145 number145=new Number145();
        TreeNode root=number145.init();
        number145.postorderTraversal(root);
    }
    public TreeNode init(){
        TreeNode C=new TreeNode(3,null,null);
        TreeNode B=new TreeNode(2,C,null);
        TreeNode A=new TreeNode(1,null,B);
        return A;
    }
    //二叉树的后序遍历 递归实现
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }
    //按照 左-右-根节点 的方式遍历
    void dfs(List<Integer> res,TreeNode root){
        if(root==null){
            return;
        }
        dfs(res,root.left);
        dfs(res,root.right);
        res.add(root.val);
        System.out.println(root.val);
    }
}
