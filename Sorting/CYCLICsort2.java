package com.jay.Sorting;

import java.util.Arrays;

public class CYCLICsort2 {
    public static void main(String[] args) {
      int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(findingMissingNum(arr,arr.length));
    }
    static int findingMissingNum(int[] arr,int n){
        sort(arr);
        for (int i = 0; i < n; i++) {
            if (i != arr[i]-1){
                return i+1;
            }
        }
        return n+1;
    }

  static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if (arr[i]<arr.length && arr[i] != arr[correct]){
              swap(arr,i,correct);
            }
            else {
                i++;
            }

     }
  }
        static void swap(int[] arr,int index,int correct) {
            int temp = arr[index];
            arr[index] = arr[correct];
            arr[correct] = temp;
      }
}
