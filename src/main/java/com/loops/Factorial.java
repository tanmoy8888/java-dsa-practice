package com.loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        /*
        while (number != 0){
            fact = number*fact;
            number--;
        }*/
        // using for loop
        for (int i = number; i >0 ; i--) {
            fact*=i;
        }
        System.out.println("fact = " + fact);
    }
}
