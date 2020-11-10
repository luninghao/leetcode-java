package com.lnh.leetcode.shuzu;

import java.util.ArrayList;
import java.util.List;

public class Number48 {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int[][] num={{1,2,3},{4,5,6},{7,8,9}};
        Number48 number48=new Number48();
        number48.rotate(num);
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
    //转置+翻转
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=t;
            }
        }
    }
}
