package com.jay.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={4,2,1,3,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    1 to N
    static void cyclicSort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
//            while (i != arr[i]-1  ){
              while(arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
        }
    }
    static void swap(int[] arr,int index,int correctIndex){
        int temp = arr[index];
        arr[index]= arr[correctIndex];
        arr[correctIndex] = temp;
    }
//    0 to N
   static void cyclicsort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
              while (i != arr[i] ){
               swap(arr,i,arr[i]);
        }
    }
}


}
