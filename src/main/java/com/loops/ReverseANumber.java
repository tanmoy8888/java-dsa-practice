package com.loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextInt();
        final int originalNumber = sc.nextInt();
        int number = originalNumber;
        int reminder = 0;
        int reverse = 0;

       /* while (number != 0){
            if(number < 10){
                reverse = reverse+number;
                break;
            }
            else {
                reminder = number % 10;
                reverse = (reverse + reminder) * 10;
            }
            number = number/10;
        }*/

        // Another approach

        while (number != 0){
            reminder = number%10;
            reverse *= 10;
            reverse +=reminder;
            number = number/10;
        }
        System.out.println("reverse = " + reverse);
        System.out.println("Sum of both = "+(originalNumber+reverse));
    }
}
