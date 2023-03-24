package com.jay.Sorting.Questions;

public class SingleElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 3, 7, 7, 10,10, 11};
        System.out.println(singleNonDuplicate(arr));

    }
    public static int singleNonDuplicate(int[] nums) {
        int i=0,j=1;
        while (i<nums.length){
            if (i==nums.length-1){
                return nums[i];
            }
           else if (nums[i] != nums[j] ){
               return nums[i];
            }
            else  {
                i+=2;
                j+=2;
            }
        }
          return -1;
    }

}
