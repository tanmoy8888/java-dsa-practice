package com.loops_4;

import java.util.Scanner;

public class PrintSumOfEvenDigitsOFaGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int reminder = 0;
        while (number > 0){
            reminder = number%10;
            if(number < 10){
                if(number %2 == 0){
                    sum += number;
                    break;
                }
            }
            if(reminder%2 ==0){
                sum +=reminder;
            }
            number = number/10;
        }
        System.out.println("sum = " + sum);
    }
}
