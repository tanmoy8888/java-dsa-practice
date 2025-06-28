package com.methods_6;

import java.util.Scanner;

/**
 * Print Pascals Triangle
 * I/P => 5
 * O/P = >
 *      1
 *     1  1
 *    1  2  1
 *   1  3  3  1
 *  1  4  6  4  1
 * 1  5  10  10  5  1
 */

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <=number ; i++) {
            for (int j = 0; j <number-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(findCombination(i,j)+"  ");
            }
            System.out.println();
        }
    }
    private static int findCombination(int n , int r){
       return factorial(n)/(factorial(r) * factorial(n-r));
    }

    private static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <=number ; i++) {
            fact *=i;
        }
        return fact;
    }
}
