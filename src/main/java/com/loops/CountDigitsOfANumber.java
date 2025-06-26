package com.loops;

import java.util.Scanner;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        System.out.println("countDigit() = " + countDigit(11));

    }
    private static int countDigit(int input){
        if(input < 10){
            return 1;
        }else {
            int count=0;
            while (input > 10){
                input = input/10;
                count++;
            }
            return (input > 0) ? count+1 : count ;
        }
    }
}
