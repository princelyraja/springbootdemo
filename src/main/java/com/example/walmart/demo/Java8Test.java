package com.example.walmart.demo;

public class Java8Test implements  FirstInterface, SecondInterface{
    public static void main(String args[]) {
        Java8Test java8Test = new Java8Test();
        java8Test.someMethod();

    }
}

interface FirstInterface {
    default void someMethod(){
        System.out.println("Am from first interface");
    }
}

interface SecondInterface extends FirstInterface{
    default void someMethod(){
        System.out.println("Am 2 from interface");
    }
}