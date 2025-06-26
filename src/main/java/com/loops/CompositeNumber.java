package com.loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean isComposite = false;
        for (int i = 2; i <N-1; i++) {
            if(N%i == 0){
                isComposite = true;
            }
        }
        System.out.println("isComposite = " + isComposite);
    }
}
