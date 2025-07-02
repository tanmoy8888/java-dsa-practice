package practice.arrays;

import java.util.Arrays;

public class ReturnSmallestAndLargestElementsOfAnArray {
    public static void main(String[] args) {
        int [] arr = {4,7,5,1,8,9};
        System.out.println("findSmallAndLarge(arr) = " + Arrays.toString(findSmallAndLarge(arr)));
    }

    public static int [] findSmallAndLarge(int [] arr){
        int max = 0;
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }else {
                min = arr[i];
            }
        }
        return new int []{min,max};
    }
}
