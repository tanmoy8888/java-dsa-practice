package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Print this below pattern
 * I/P = > Any positive integer , here N =4
 * O/P = >
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 */
public class EleventhPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                } else {
                    if (j % 2 == 0) System.out.print(1 + " ");
                    else {
                        System.out.print(0 + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
