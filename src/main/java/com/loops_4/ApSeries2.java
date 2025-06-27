package com.loops_4;

import java.util.Scanner;

/**
 * Display this AP - 4,7,10,13,16,19..... up to 'N'
 *
 */

public class ApSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 4; i <= (3*input+1); i+=3) {
            System.out.println(i);
        }
    }

}
