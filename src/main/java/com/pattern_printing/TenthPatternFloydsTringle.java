package com.pattern_printing;

import java.util.Scanner;

/**
 *  1
 *  2 3
 *  4 5 6
 *  7 8 9 10
 *
 */

public class TenthPatternFloydsTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
               /* System.out.print(a+" ");
                a++;*/
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
