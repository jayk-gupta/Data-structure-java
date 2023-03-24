package com.jay.Recursion;

public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        //base condition
        if (n<2){
            return n;
        }
        //This is not tail recursion.
        // first f(n-1) is called then f(n-2) is called
        //Then the addition of these two are returned
        return fibo(n-1) + fibo(n-2);
    }
}
