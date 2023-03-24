package com.jay.LeetcodeQuestions.Array;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] ans = transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }


    }
    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                   ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}
