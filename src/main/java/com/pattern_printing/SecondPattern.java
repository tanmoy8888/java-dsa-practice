package com.pattern_printing;

import java.util.Scanner;

/**
 *  Print this below pattern
 * Input => N ,
 * Example : N => 4
 * O/P =>
 *  1234
 *  1234
 *  1234
 *  1234
 *
 */
public class SecondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <= number ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
