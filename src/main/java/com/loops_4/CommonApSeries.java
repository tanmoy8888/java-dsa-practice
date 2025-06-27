package com.loops_4;

import java.util.Scanner;

/**
 *  This is a common generic AP solution , we just need to change initial and increment variable value,
 *  and it will print AP series of N number.
 */

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
