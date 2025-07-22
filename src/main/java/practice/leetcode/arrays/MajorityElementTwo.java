package practice.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leetcode : Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */

public class MajorityElementTwo {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("Output = " + majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int count = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[Math.abs(i)])) {
                map.put(nums[Math.abs(i)], 1);
            } else {
                map.put(nums[Math.abs(i)], map.get(nums[Math.abs(i)]) + 1);
                if (map.get(nums[Math.abs(i)]) > count) {
                    list.add(nums[Math.abs(i)]);
                }
            }
        }
        return list;
    }

}
