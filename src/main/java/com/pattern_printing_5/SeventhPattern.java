package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Print this below pattern
 *
 * I/P => N = 2
 * O/P =>
 *       1
 *       A B
 *
 * I/P => N = 4
 * O/P =>
 *          1
 *          A B
 *          1 2 3
 *          A B C D
 *
 */
public class SeventhPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=i ; j++) {
                    if(i%2 ==0) {
                        System.out.print((char) (j+64) + " ");
                    }else {
                        System.out.print(j+" ");
                    }

            }
            System.out.println();
        }
    }
}
