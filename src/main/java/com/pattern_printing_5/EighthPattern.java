package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Print this below pattern
 *   I/P => 4
 *   O/P =>
 *
 *     * * * *
 *     * * *
 *     * *
 *     *
 */
public class EighthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = number; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
