package com.loops;

import java.util.Scanner;

/**
 * I/P = > 5
 * O/P =>  1! , 2! , 3! , 4! , 5!
 */
public class PrintFactorialOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println("factorial() of "+i+" is , " + factorial(i));
        }
    }
    private static int factorial(int i) {
        int fact = 1;
        if (i == 0) return 1;
        else if (i > 0) {
            while (i != 0) {
                fact *= i;
                i--;
            }
        }
        return fact;
    }
}
