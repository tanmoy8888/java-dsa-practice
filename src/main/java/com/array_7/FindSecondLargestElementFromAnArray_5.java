package com.array_7;

public class FindSecondLargestElementFromAnArray_5 {
    public static void main(String[] args) {
        int [] arr = {-10,-2,-5,-3,-6,-7,-4,-9,-1};
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        int second_largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(second_largest < arr[i] && arr[i] != maximum){
                second_largest = arr[i];
            }
        }
        System.out.println("maximum = " + maximum);
        System.out.println("second_largest = " + second_largest);
    }
}
