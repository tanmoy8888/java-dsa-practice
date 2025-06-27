package com.loops_4;

import java.util.Scanner;

/**
 * Display this AP - 1,3,5,7,9 ..... up to 'N'
 *
 */

public class APSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int limit = 2*N -1;
        for (int i = 1; i <= limit ; i+=2) {
            System.out.println(i);
        }
    }
}
