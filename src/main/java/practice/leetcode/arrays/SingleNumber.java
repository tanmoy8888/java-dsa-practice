package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode :  136. Single Number
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * <p>
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        //int[] nums = {4, 1, 2, 1, 2};
        int[] nums = {2,2,1};
        System.out.println("singleNumber(nums) = " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int singleNumber = -1;
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                singleNumber = i;
                break;
            }
        }
        return singleNumber;
    }
}
