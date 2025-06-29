package com.array_7;

import java.util.Arrays;

/**
 *             **************  TWO POINTER ***************
 *
 *  Given an int [] ={1,2,3,4,5,6,7,8} , reverse it without using extra array.
 */
public class TwoPointer_8 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int i = 0;
        int j = arr.length-1;
        int temp = 0;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
