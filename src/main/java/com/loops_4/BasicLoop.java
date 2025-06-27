package com.loops_4;

import java.util.Scanner;

public class BasicLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= 0) {
            for (int i = 0; i < input; i++) {
                System.out.println("Hello");
                System.out.println("World !!");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                System.out.println("World !!");
            }
        }
    }
}
