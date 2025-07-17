package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode : 560. Subarray Sum Equals K
 */

public class SubArraySum {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3};
        int[] nums = {1, 1, 1};
        //int k = 3;
        int k = 2;
        System.out.println("Output = " + subarraySum(nums, k));
    }

    // Bruteforce
    public static int subarraySum(int[] nums, int k) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                if((nums[i]+nums[j]) == k){
                    System.out.println("nums[i] = " + nums[i]);
                    System.out.println("nums[j] = " + nums[j]);
                    System.out.println("nums[i] +nums[j] = " + (nums[i]+nums[j]));
                    count++;
                }
            }
        }
        return count;
    }
}
