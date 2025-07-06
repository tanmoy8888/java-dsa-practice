package com.array_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ****************  TWO POINTER ************
 * <p>
 * Rotate an array of N by K steps where K will be non-negative
 * Note : K can also be greater than N where N is the size of the array.
 * I/P = > int [] arr ={2,3,5,7,11,13,17} , k =5
 */
public class ArrayRotationByKThPosition_9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        System.out.println("original array = " + Arrays.toString(arr));
        int k = 5;
        if (k > arr.length) {
            k = k % arr.length;
        }
        // First Rotate entire array
        rotateArray(arr, 0, arr.length - 1);
        // Rotate first part
        rotateArray(arr, 0, (arr.length - k - 1));
        // Rotate second part
        rotateArray(arr, (arr.length - k), arr.length - 1);
        System.out.println("After Rotate 2 = " + Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
