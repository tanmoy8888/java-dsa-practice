package practice.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode :  268. Missing Number
 *
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,0,1]
 *
 * Output: 2
 *
 * Explanation:
 *
 * n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 *
 * Example 2:
 *
 * Input: nums = [0,1]
 *
 * Output: 2
 *
 * Explanation:
 *
 * n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 *
 * Example 3:
 *
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 *
 * Output: 8
 *
 * Explanation:
 *
 * n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {
    public static void main(String[] args) {
        //int [] nums = {3,0,1};
        //int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums = {0,1};
        System.out.println("Missing Number  = " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int missingNumber = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!map.containsKey(i)) {
                missingNumber = i;
                break;
            }
        }
        return missingNumber;
    }
}
