package com.loops;

import java.util.Scanner;

public class CommonApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int initial = 1;
        int increment = 2;
        for (int i = 1; i <= input ; i++) {
            System.out.println(initial);
            initial+=increment;
        }

    }
}
