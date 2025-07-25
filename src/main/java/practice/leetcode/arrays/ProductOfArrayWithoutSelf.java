package practice.leetcode.arrays;

import java.util.Arrays;

/**
 * Leetcode : 238. Product of Array Except Self
 */

public class ProductOfArrayWithoutSelf {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 4};
        int[] nums = {-1, 1, 0, -3, 3};
        System.out.println("Output = " + Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i];
        }
        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProduct[i] = nums[i] * suffixProduct[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = suffixProduct[i + 1];
            } else if (i == nums.length - 1) {
                nums[i] = prefixProduct[i - 1];
            } else {
                nums[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
            }
        }
        return nums;
    }
}
