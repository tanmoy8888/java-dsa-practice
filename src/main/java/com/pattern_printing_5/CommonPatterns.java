package com.pattern_printing_5;

import java.util.Scanner;

/**
 *  I/P =>  N = 3
 *  O/P =>
 *                  * * *
 *                    * *
 *                      *
 *
 * I/P =>  N = 5
 *  *  O/P =>
 *  *           * * * * *
 *  *             * * * *
 *  *               * * *
 *  *                 * *
 *  *                   *
 *  *
 *
 *
 */
public class CommonPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int nsp=number-1;
        int nst =number;
        for (int i = 1; i <=number ; i++) {
            for (int j = 0; j <=nsp ; j++) {
                    System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("*"+" ");
            }
            nsp+=1;
            nst--;
            System.out.println();
        }


    }
}
