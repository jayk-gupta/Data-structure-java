package com.jay.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortRev {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static  void swap(int[] arr,int first,int second){
        int temp = arr[first];
       arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = 0; i <=end; i++) {
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }













//    Given an array A of N elements.
//    Find the majority element in the array.
//    A majority element in an array A of size N is an element that appears more than N/2 times in the array.


}
