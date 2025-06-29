package com.array_7;

public class FindMaximumElementFromAnArray_4 {
    public static void main(String[] args) {
        //int [] arr = {2,6,8,10,15,-1,0,3};
        int [] arr = {-10,-2,-5,-3,-6,-7,-4,-9,-1};
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        System.out.println("maximum = " + maximum);
    }
}
