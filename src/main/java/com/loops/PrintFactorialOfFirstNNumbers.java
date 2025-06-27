package com.loops;

import java.util.Scanner;

/**
 * I/P = > 5
 * O/P =>  1! , 2! , 3! , 4! , 5! , complexity N [using single loop]
 */
public class PrintFactorialOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        factorial(number);
    }
    private static void factorial(int number) {
        int fact = 1;
        for (int i = 0; i <=number; i++) {
           if(i ==0 || i ==1){
               fact = 1;
           }else {
               fact = fact*i;
           }
            System.out.println("fact = of "+i+" is , " + fact);
        }
    }
}
