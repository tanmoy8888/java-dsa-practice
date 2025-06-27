package com.pattern_printing;

import java.util.Scanner;

/**
 * I/P => N , N can be a positive integer
 * Example : N = 4 ,
 *
 * O/P=>
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

public class SixthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
