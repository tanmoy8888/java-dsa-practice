package com.loops;

import java.util.Scanner;

public class PrintingTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Table of "+number+" , "+i+" is "+i*number);
        }
    }
}
