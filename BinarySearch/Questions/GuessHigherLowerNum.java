package com.jay.BinarySearch.Questions;

public class GuessHigherLowerNum {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    public static int guessNumber(int n) {
        int start=1;
        int end = n;
        while (start<=end){
            //find middle element
            int mid = start + (end-start)/2;
            //Check whether mid is equal to greater than or smaller than Pick
            int num = guess(mid);
            if (num ==0) return mid;
            //If target<number
            if (num==-1){
                end=mid-1;
            }
            //If target>number
            else if (num==1){
                start = mid+1;
            }
        }
         return -1;
    }

    static int guess(int mid){
        int pick = 8;
        if (mid>pick){
            return -1;
        }
        else if(mid<pick){
            return 1;
        }
        return 0;
    }
}
