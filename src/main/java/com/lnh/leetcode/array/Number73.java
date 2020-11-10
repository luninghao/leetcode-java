package com.lnh.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class Number73 {
    public static void main(String[] args) {
        int[][] num={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        Number73 number73=new Number73();
        number73.setZeroes(num);
        for(int i=0;i<num.length;i++){
            System.out.println(" ");
            for(int j=0;j<num[0].length;j++){
                System.out.print(num[i][j]+" ");
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        Set<Integer> mset=new HashSet<Integer>();
        Set<Integer> nset=new HashSet<Integer>();
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matrix[i][j]==0){
                    mset.add(i);
                    nset.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mset.contains(i) || nset.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }

}
