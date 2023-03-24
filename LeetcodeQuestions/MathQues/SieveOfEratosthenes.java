package com.jay.LeetcodeQuestions.MathQues;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 4;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        sieve(n,isPrime);
    }

    static void sieve(int n,boolean[] primes){
        for (int i = 2; i*i<=n ; i++){
            //if index is true i.e. number is prime, marks all the multiples of it as false
            if (primes[i]){
                for (int j = i*2; j <= n; j=j+i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
         if (primes[i]){
               System.out.println(i+" ");
           }
        }

    }

}
