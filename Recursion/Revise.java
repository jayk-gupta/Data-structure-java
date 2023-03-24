package com.jay.Recursion;

public class Revise {
    public static void main(String[] args) {
      message();
    }
//    The question only one function you have to call and that should print "hello world" 5 times
//    To print multiple times we can call same function many times
    static void message(){
        System.out.println("Hello World");
        message1();

    }  static void message1(){
        System.out.println("Hello World");
        message2();

    }  static void message2(){
        System.out.println("Hello World");
        message3();

    }  static void message3(){
        System.out.println("Hello World");
        message4();

    }    static void message4(){
        System.out.println("Hello World");
    }
//When message4 function is fininshed executing it will comeout form the line from where it was called

}
