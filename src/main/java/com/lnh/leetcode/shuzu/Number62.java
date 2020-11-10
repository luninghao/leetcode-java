package com.lnh.leetcode.shuzu;

public class Number62 {
    public static void main(String[] args) {
        int m=7,n=3;
        Number62 number56=new Number62();
        System.out.println(number56.uniquePaths(m,n));
    }
    //动态规划yyds
    public int uniquePaths(int m, int n) {
        int[][] nums=new int[m][n];
        for(int i=0;i<m;i++) nums[i][0]=1;
        for(int i=0;i<n;i++) nums[0][i]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                nums[i][j]=nums[i][j-1]+nums[i-1][j];
            }
        }
        return nums[m-1][n-1];
    }
}
