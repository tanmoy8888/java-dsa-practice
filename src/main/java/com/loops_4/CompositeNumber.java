package com.loops_4;

import java.util.Scanner;

/**
 * Find a number composite if it has a factor more than three.
 */
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean isComposite = false;
        for (int i = 2; i <N; i++) {
            if(N%i == 0){
                isComposite = true;
                break;
            }
        }
        System.out.println("isComposite = " + isComposite);
    }
}
