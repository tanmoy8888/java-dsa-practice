package com.if_else;

import java.util.Scanner;

/**
 * Take three positive integers and found max among them
 */
public class FindMaxAmongThreeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("a is maximum");
        } else if (b > a && b > c) {
            System.out.println("b is maximum");
        } else {
            System.out.println("c is maximum");
        }
    }
}
