package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

/*
Leetcode : 724. Find Pivot Index

 */
public class PivotSumIndex {
    public static void main(String[] args) {
       int [] nums = {1,7,3,6,5,6};
        System.out.println("Input = " + Arrays.toString(nums));
        System.out.println("Output = " + pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
     int [] prefixSumLeft = new int[nums.length];
        int sum = 0;
        for (int i = nums.length-1; i >=0  ; i--) {
            sum += nums[i];
            System.out.println("sum = " + sum);
            prefixSumLeft[i] = sum;
        }
        System.out.println("Output right= " + Arrays.toString(prefixSumLeft));
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        System.out.println("Output left= " + Arrays.toString(nums));
        return -1;
    }
}
