package com.array_7;

/**
 *  Find two numbers from a given array which sum will be the input
 */
public class TwoSum_7 {
    public static void main(String[] args) {
        int [] arr = {-2,5,1,0,4,3,2,10};
        int input = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[i]+arr[j] == input){
                    System.out.println("sum of "+input+" found , elements are , "+arr[i]+" and "+arr[j]);
                    break;
                }
            }
        }
    }
}
