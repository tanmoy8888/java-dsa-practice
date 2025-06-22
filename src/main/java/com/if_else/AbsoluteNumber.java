package com.if_else;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i < 0){
            System.out.println("Absolute value is , "+(i*-1));
        }else {
            System.out.println("Absolute value is , "+i);
        }
    }
}
