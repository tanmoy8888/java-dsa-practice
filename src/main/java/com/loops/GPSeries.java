package com.loops;

import java.util.Scanner;

/**
 * Print this GP series 1,2,4,8,16,32 upto N
 */
public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int initial = 1;
        int increment = 2;
        for (int i = 0; i <= input; i++) {
            System.out.println(initial);
            initial *= increment;
        }
    }
}
