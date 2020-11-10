package com.lnh.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Number144 {
    public static void main(String[] args) {
        Number144 number144=new Number144();
        TreeNode root=number144.init();
        number144.preorderTraversal(root);
    }
    public TreeNode init(){
        TreeNode C=new TreeNode(3,null,null);
        TreeNode B=new TreeNode(2,C,null);
        TreeNode A=new TreeNode(1,null,B);
        return A;
    }
    //二叉树的前序遍历 递归实现
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }
    //按照根节点-左-右的方式遍历
    void dfs(List<Integer> res,TreeNode root){
        if(root==null){
            return;
        }
        res.add(root.val);
        System.out.println(root.val);
        dfs(res,root.left);
        dfs(res,root.right);
    }
}
