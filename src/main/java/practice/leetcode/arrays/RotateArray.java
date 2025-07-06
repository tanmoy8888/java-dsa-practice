package practice.leetcode.arrays;

import java.util.Arrays;

/**
 * Leetcode : 189. Rotate Array
 */
public class RotateArray {
    public static void main(String[] args) {
     int [] nums = {1,2,3,4,5,6,7};
     //int [] nums = {1,2,3,4,5,6,7};
     //int [] nums = {-1,-100,3,99};
     //int k = 5;
     int k = 3;
     //int k = 2;
        System.out.println("Input = " + Arrays.toString(nums));
        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        rotateArray(nums, 0, nums.length-1);
        // rotate first part
        rotateArray(nums, 0, (k-1));
        // rotate second part
        rotateArray(nums, k, nums.length - 1);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    public static void rotateArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
