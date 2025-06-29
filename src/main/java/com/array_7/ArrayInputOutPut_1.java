package com.array_7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutPut_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = i+1;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
