package com.loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
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
            reverse = reverse+reminder;
            number = number/10;
        }
        System.out.println("reverse = " + reverse);

    }
}
