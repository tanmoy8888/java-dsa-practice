package com.array_7;

import java.util.Scanner;

/**
 *  LinearSearch
 */

public class FindAnElementInAnArray_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        int element =6;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                System.out.println("Element found in index  : " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not found");
        }
    }
}
