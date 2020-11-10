package com.lnh.leetcode.shuzu;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Number74 {
    public static void main(String[] args) {
        int[][] num={{1,3,5,7},{11,13,14,16},{17,19,20,22}};
        int a=3;
        Number74 number74=new Number74();
        System.out.println(number74.searchMatrix(num,a));
    }
    //暴力枚举
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if(matrix==null ||matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//        int m=matrix.length,n=matrix[0].length;
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(matrix[i][j]==target) return true;
//            }
//        }
//        return false;
//    }
    //二分查找
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null ||matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m=matrix.length,n=matrix[0].length;
        int left = 0, right = m * n - 1;
        int pivotIdx, pivotElement;
        while (left <= right) {
            pivotIdx = (left + right) / 2;
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            if (target == pivotElement){
                return true;
            }
            else {
                if (target < pivotElement) {
                    right = pivotIdx - 1;
                }
                else {
                    left = pivotIdx + 1;
                }
            }
        }
        return false;
    }
}
