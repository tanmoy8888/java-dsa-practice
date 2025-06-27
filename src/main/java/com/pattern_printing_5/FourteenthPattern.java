package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Print this below pattern
 *
 *                      *
 *                    * *
 *                  * * *
 *                * * * *
 *
 * hint : (i+j) < n sout("*")
 *
 * Important : Don't forget to add an actual space like in line no 24 two spaces should be there ("  ")
 */
public class FourteenthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number ; j++) {
                if(j <= number-i){
                    System.out.print("  ");
                }else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }

}
