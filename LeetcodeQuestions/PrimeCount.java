package com.jay.LeetcodeQuestions;

public class PrimeCount {
    public static void main(String[] args) {
        System.out.println(CountPrimes(19));
    }
    public static int CountPrimes(int n) {
        if (n==0||n==1 ||n==2){
            return 0;
        }
      int count=0,countPrime=0;
        for (int i = 2; i <n ; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count==0){
                countPrime++;
            }
            count=0;

        }
        return countPrime;

    }




}

