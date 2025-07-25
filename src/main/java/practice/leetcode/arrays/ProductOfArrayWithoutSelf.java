package practice.leetcode.arrays;

import java.util.Arrays;

/**
 *
 * Leetcode : 238. Product of Array Except Self
 */

public class ProductOfArrayWithoutSelf {
    public static void main(String[] args) {
      int [] nums ={1,2,3,4};
     // int [] nums ={-1,1,0,-3,3};
      System.out.println("Output = " + Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        System.out.println("Arrays.toString(Input) = " + Arrays.toString(nums));
        int [] prefixProduct = new int[nums.length];
        prefixProduct[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i];
        }
        System.out.println("Arrays.toString(prefixProduct) = " + Arrays.toString(prefixProduct));
        int [] suffixProduct = new int[nums.length];
        suffixProduct[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i > 0; i--) {
            suffixProduct[i] = nums[i-1] * suffixProduct[i];
        }
        System.out.println("Arrays.toString(prefixProduct) = " + Arrays.toString(suffixProduct));
        return prefixProduct;
    }
}
