package com.pattern_printing;

import java.util.Scanner;

/**
 * Print this below pattern ,
 * I/P => 4
 *
 * O/P =>
 *  1
 *  1 3
 *  1 3 5
 *  1 3 5 7
 *
 *  Hint : (2j-1)  // Check this !!
 *  
 */
public class NinthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i<=number ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }

    }

}
