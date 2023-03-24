package com.jay.BinarySearch.Questions;

public class ArrangingCoins {
    public static void main(String[] args) {

        System.out.println(arrangeCoins(1));


    }

    public static int arrangeCoins(int n) {
        int j=0;
        while (n>0){
            j++;
            n-=j;

        }
        if (n==0) return j;
        return j-1;
    }

}
