package com.pattern_printing;

import java.util.Scanner;

/**
 *  Star Pyramid pattern  [Very, very important]
 *               *
 *             * * *
 *            * * * * *
 *          * * * * * * *
 *   hint :    (2i-1)
 *
 */
public class SixteenthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <=number ; i++) {
            for (int j = 0; j <=number; j++) {
                if(j <= number-i){
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*"+ "  ");
            }
            System.out.println();
        }
    }
}
