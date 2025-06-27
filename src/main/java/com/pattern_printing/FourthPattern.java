package com.pattern_printing;

import java.util.Scanner;

/**
 *  I/P=> any number n , Example 4
 *  O/P =>
 *  A B C D
 *  A B C D
 *  A B C D
 *  A B C D
 */
public class FourthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <number; j++) {
                char c = (char) (65+j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
