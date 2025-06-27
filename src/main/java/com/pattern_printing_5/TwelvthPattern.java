package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Pattern
 *  I/P = > Inout N will always be an odd integer
 *  O/P => For N = 5
 *
 *                  *
 *                  *
 *              * * * * *
 *                  *
 *                  *
 * Hint : Find middle element , formula to find a middle element of a odd number is (N/2 +1)
 *
 */
public class TwelvthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int middle = number/2+1;
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=number ; j++) {
                if(i==middle || j == middle) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
            }
        }
}
