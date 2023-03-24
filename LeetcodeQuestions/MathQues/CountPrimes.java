package com.jay.LeetcodeQuestions.MathQues;

import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 41;
        System.out.println(sieve(n));
    }
    static int sieve(int n){
        if (n<2) return  0;
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        int count=0;
        for (int i = 2; i*i<=n ; i++){
            //if index is true i.e. number is prime, marks all the multiples of it as false
            if (primes[i]){
                for (int j = i*2; j <= n; j=j+i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <n ; i++) {
             if (primes[i]){
             count++;
            }
        }
      return count;
    }

}
