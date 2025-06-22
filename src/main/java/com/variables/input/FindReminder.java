package com.variables.input;

import java.util.Scanner;

public class FindReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            if(a%b ==0){
                System.out.println("Completely divisible");
            }else{
                System.out.println("There is a reminder , "+(a%b));
            }
        }
        else{
            System.out.println("a is less than b");
        }
    }
}
