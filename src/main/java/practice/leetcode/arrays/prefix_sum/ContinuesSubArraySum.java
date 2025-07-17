package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

public class ContinuesSubArraySum {
    public static void main(String[] args) {
        /*int [] nums = {23,2,4,6,7};
        int k = 6;*/
        /*int [] nums = {23,2,6,4,7};
        int k = 13;*/
       /* int [] nums = {23,2,4,6,6};
        int k = 7;*/
        int[] nums = {0,0};
        int k = 1;
        System.out.println("Output = " + checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        boolean found = false;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            if (nums[i] == k ||((nums[i] == k || nums[i] % k == 0) && i > 2) || ((nums[i] % k == nums[i - 1] % k) && (i > 2))) {
                found = true;
            }
        }
        return found;
    }
}
