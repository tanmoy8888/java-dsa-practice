package practice.arrays;

import java.util.Arrays;

// Move all the zeros to the end.

public class CopyZerosAtTheEnd {
    public static void main(String[] args) {
       // int[] arr = {4, 5, 0, 10, 0, 1, 0, 3, 7, 0, 0};
        int[] arr = {0,1,0,3,12};
        System.out.println("Before = " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[end] == 0) {
                end--;
            } else if (arr[start] == 0) {
                arr[start] = arr[end];
                arr[end] = 0;
                start++;
                end--;
            } else {
                start++;
            }
        }
        System.out.println("After = " + Arrays.toString(arr));
    }
}
