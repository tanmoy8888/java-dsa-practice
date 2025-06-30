package practice.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
       /* int[] nums = {3,3};
        int target = 6;*/
       /* int[] nums = {3, 2, 4};
        int target = 6;*/
        System.out.println("twoSum(nums,target) = " + Arrays.toString(twoSum(nums, target)));
    }

    /*public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int currentSum = 0;
        int[] ans = new int[2];
        while (start < end) {
            currentSum = nums[start] + nums[end];
            if (currentSum == target) {
                ans[0] = start;
                ans[1] = end;
                break;
            }
            else if (currentSum < target) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }*/
    // For unsorted array above solution will not work.

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && (map.get(target - nums[i]) != i)) {
                    ans[0] = i;
                    ans[1] = map.get(target - nums[i]);
                    break;
                }
        }
        return ans;
    }


}
