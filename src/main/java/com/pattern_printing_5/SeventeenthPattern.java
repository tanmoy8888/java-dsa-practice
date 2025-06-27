package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Print this below pattern
 * I/P => N =4
 * O/p =>
 *             *
 *           * * *
 *         * * * * *
 *        * * * * * * *
 *          * * * * *
 *           * * *
 *             *
 *
 */
public class SeventeenthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // First part
        int nsp = number-1;
        int nst = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*"+" ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
       // Second part
        int nspPart2 = 1;
        int nstPart2 = number+1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= nspPart2; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= nstPart2; j++) {
                System.out.print("*"+" ");
            }
            nstPart2-=2;
            nspPart2++;
            System.out.println();
        }
    }
}
