package com.array;

/**
 *  Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
 *  Find the number(between 1 to N), that is not present in the given array.
 *
 * Example 1:
 * Input Format: N = 5, array[] = {1,2,4,5}
 * Result: 3
 * Explanation: In the given array, number 3 is missing. So, 3 is the answer.
 *
 * Example 2:
 * Input Format: N = 3, array[] = {1,3}
 * Result: 2
 * Explanation: In the given array, number 2 is missing. So, 2 is the answer.
 *
 */
public class FindMissingNumberFromAnArray {

    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int N = 5;
        System.out.println("findMissingNumber(arr,N) = " + findMissingNumber(arr, N));
    }

    private static int findMissingNumber(int [] arr, int N){
        for (int i = 1; i <= N ; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }

}
