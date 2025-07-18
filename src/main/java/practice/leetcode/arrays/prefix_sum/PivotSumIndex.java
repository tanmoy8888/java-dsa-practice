package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

/*
Leetcode : 724. Find Pivot Index

 */
public class PivotSumIndex {
    public static void main(String[] args) {
        //int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums = {-1,-1,0,0,-1,-1};
        System.out.println("Input = " + Arrays.toString(nums));
        System.out.println("Output = " + pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        int[] prefixSumLeft = new int[nums.length];
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            prefixSumLeft[i] = sum;
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == prefixSumLeft[i]) {
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }
}
