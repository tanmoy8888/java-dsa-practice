package practice.leetcode.arrays;

import java.util.Arrays;

/**
 *
 * Leetcode : 238. Product of Array Except Self
 */

public class ProductOfArrayWithoutSelf {
    public static void main(String[] args) {
      int [] nums ={1,2,3,4};
        System.out.println("Output = " + Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
    int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = product/nums[i];
        }
        return nums;
    }
}
