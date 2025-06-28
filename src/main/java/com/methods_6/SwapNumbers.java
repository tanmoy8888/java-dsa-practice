package com.methods_6;

import java.util.Scanner;
// Swap two numbers using a temp variable

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping two number ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
