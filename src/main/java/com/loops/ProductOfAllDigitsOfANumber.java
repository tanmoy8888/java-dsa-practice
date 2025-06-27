package com.loops;

import java.util.Scanner;

public class ProductOfAllDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        int reminder = 0;
        while (number > 0){
            reminder = number%10;
            if(number <0){
                product *=product*number;
                break;
            }
            if(reminder > 0) {
                product *= reminder;
            }
            number = number/10;
        }
        System.out.println("product = " + product);
    }
}
