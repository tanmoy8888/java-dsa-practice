package com.loops;

import java.util.Scanner;

/**
 * WAP to find the highest factor of a number N (Other than N itself)
 *  Example : 1,2,3,4,5,10,20,30,60
 *  N = 60
 *  O/P => 30 (highest factor)
 */
public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factor = -1;
        for (int i = 1; i <=N ; i++) {
            if(N%i == 0 && N != i){
                factor = i;
            }
        }
        System.out.println(factor);
    }
}
