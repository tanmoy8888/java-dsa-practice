package com.input_1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = sc.nextInt();
        System.out.println("Enter second integer");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("result = " + result);
    }
}
