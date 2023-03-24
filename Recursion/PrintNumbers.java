package com.jay.Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        print1(1);
    }
    //body and definition is same , name is different
  static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    //Function body here changes
    static void print5(int n){
        System.out.println(n);
    }
}
