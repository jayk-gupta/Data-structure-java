package com.jay.Sorting.Questions;

import java.util.Arrays;

public class CyclicSort3 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5};
        int ans = missingNumber(arr,arr.length+1);
        System.out.println(ans);
    }
    static int missingNumber(int A[], int N)
    {
    int i =0;
    while(i<N-1){
        int correct = A[i]-1;
        if (A[i] != A[correct] && A[i] < N-1){
            int temp = A[i];
           A[i] =  A[correct] ;
           A[correct] = temp ;
        }
        else{
            i++;
        }
    }
        for (int j = 0; j < N-1; j++) {
            if (A[j] != j+1) return j+1;
        }
    return N;
    }

}
