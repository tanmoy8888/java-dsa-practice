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

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            map.put(nums[i], 1);
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("map.entrySet() = " + map.entrySet());

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == k || (nums[i]-k == nums[i-1])){
                count++;
            }
        }
        return count;
    }
}
