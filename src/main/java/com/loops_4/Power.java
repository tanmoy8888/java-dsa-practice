package com.loops_4;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *=number;
        }
        System.out.println("Power of  = "+number+" is , " + result);
    }
}
