package com.array_7;

import java.util.Scanner;

/**
 *  Print the sum of elements of a given array
 */

public class CalculateSumOfElementsInArray_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            sum +=arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
