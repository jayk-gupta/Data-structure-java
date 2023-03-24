package com.jay.Sorting.Questions;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
       int[] arr = {-1,0};
        System.out.println(Arrays.toString(twoSum(arr,-1)));

    }

  public static int[] twoSum(int[] numbers, int target) {
        int i =0,j=numbers.length-1;
      while (i<j){
          int sum =numbers[i]+numbers[j];
          if (sum > target){
              j--;
          }
          else if (sum < target){
              i++;
          }
          else {
              return new int[]{i+1,j+1};
          }

      }
     return new int[] {-1,-1};
  }

}
