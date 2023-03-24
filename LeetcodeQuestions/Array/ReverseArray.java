package com.jay.LeetcodeQuestions.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
          int[] arr = {1,2,4,5,6,21,32,45};
          Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] A){
        int start =0;
        int end =  A.length-1;
        while (start<end){
            int temp = A[start];
            A[start]=A[end];
            A[end] =temp;
            start++;
            end--;
        }

    }
}
