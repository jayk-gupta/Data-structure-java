package com.jay.Recursion;

public class NumbersExampleRev {
    public static void main(String[] args) {
//print numbers,write a function that takes  a number and prints it.
//        print first 5 numbers
print1(1);

    }
//    Function calling other function
//    The body and the definition is the same just the name is different


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
static void print5(int n){
    System.out.println(n);
}


//All the function calls go into the stack memory
//First main is called







}
