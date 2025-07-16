package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

/**
 *  Leetcode : 1480. Running Sum of 1d Array
 *
 *
 */
public class RunningSumOf1DArray {
    public static void main(String[] args) {
     //int [] nums = {1,2,3,4};
     int [] nums = {1,1,1,1,1};
        System.out.println("Input = " + Arrays.toString(nums));
        System.out.println("Output = " + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
