package com.jay.BinarySearch.BinarySearch2dArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
      int[][] arr = {
              {10,20,30,40},
              {15,25,35,45},
              {28,29,37,49},
              {23,34,38,50}
      };
        System.out.println(Arrays.toString(search(arr,50)));
    }
    static int[] search(int[][] matrix, int target){
        int row=0;
        int col= matrix.length-1;
        while (row<matrix.length && col>=0){
            if (target == matrix[row][col]){
                return new int[] {row,col};
            }
            else if (target > matrix[row][col]){
                row++;
            }
//            target < matrix[row][column]
            else {
                col--;
            }
        }
        //if not found
    return new int[]{-1,-1};
    }
}
