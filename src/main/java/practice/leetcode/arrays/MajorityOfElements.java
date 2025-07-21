package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityOfElements {
    public static void main(String[] args) {
        //int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums = {3, 2, 3};
        // int[] nums = {1};
        System.out.println("Output = " + majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int majorityElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(Math.abs(nums[i]))) {
                map.put(Math.abs(nums[i]), 1);
            } else {
                map.put(Math.abs(nums[i]), map.get(Math.abs(nums[i])) + 1);
                if (map.get(Math.abs(nums[i])) > maxCount) {
                    maxCount = map.get(Math.abs(nums[i]));
                    majorityElement = nums[i];
                }
            }
        }
        return majorityElement;
    }
}
