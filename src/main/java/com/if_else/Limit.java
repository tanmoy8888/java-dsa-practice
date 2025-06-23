package com.if_else;

import java.util.Scanner;

/**
 * Given a positive integer , if it is less than 999 then return true else false
 */
public class Limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i > 0 && i <=999){
            System.out.println("Number is below 1000");
        }else {
            System.out.println("Number is above or equals 1000");
        }
    }
}
