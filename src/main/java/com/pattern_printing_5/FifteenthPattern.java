package com.pattern_printing_5;

import java.util.Scanner;

/**
 * Print this below pattern
 *
 * I/P => N = 4
 * O/P =>
 *            1
 *          1 2
 *        1 2 3
 *      1 2 3 4
 */
public class FifteenthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        /*for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <= number; j++) {
                if(j <= number-i){
                    System.out.print("  ");
                }else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        O/P =>

       I/P => 4
      4
    3 4
  2 3 4
1 2 3 4
        */
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <= number-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
