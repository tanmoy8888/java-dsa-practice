package com.methods_6;

import java.util.Scanner;

public class FindCombinationOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("findCombination() is " + findCombination(n,r));
    }

    private static int findCombination(int n , int r){
        if( n > r) return factorial(n)/(factorial(r) * factorial(n-r));
        else return -1;
    }

    private static int factorial(int number) {
        int fact = 1;
        if(number == 0) return 1;
        for (int i = 1; i <=number ; i++) {
            fact *=i;
        }
        return fact;
    }
}
