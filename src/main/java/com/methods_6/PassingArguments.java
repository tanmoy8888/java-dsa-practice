package com.methods_6;

public class PassingArguments {
    public static void main(String[] args) {
     greet("Rahul",27);
    }
    private static void greet(String name,int age){
        System.out.println("Good Morning !!");
        System.out.println("Hello , "+name+" !!"+" , your age is :: "+age);
    }

}
