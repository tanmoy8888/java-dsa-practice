package com.array_7;

import java.util.Scanner;

public class CountElementsGreaterThanAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = {-10, -2, 1, 5, 7, 8, 9, -1, -9, -1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (input < arr[i]) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
