package com.if_else_3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i%2 ==0){
            System.out.println("Given number is even");
        }
        else {
            System.out.println("Given number is odd");
        }
    }
}
