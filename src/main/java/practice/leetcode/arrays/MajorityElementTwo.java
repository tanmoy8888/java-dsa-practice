package practice.leetcode.arrays;

import java.util.*;

/**
 * Leetcode : Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */

public class MajorityElementTwo {
    public static void main(String[] args) {
        //int[] nums = {3, 2, 3};
        //int[] nums = {2,2};
        // int[] nums = {1};
        int[] nums = {1, 2};
        System.out.println("Output = " + majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        if (nums.length < 3) {
            int maxElement = nums[0];
            int maxCount = 0;
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++){
                if (!map.containsKey(nums[Math.abs(i)])) {
                    map.put(nums[Math.abs(i)], 1);
                    list.add(nums[Math.abs(i)]);
                } else {
                    map.put(nums[Math.abs(i)], map.get(nums[Math.abs(i)]) + 1);
                    if(map.get(nums[Math.abs(i)]) > maxCount){
                        maxCount = map.get(nums[Math.abs(i)]);
                        maxElement = nums[Math.abs(i)];
                    }
                }
            }
            return maxCount == 0 ? list : Arrays.asList(maxElement);
        } else {
            int count = nums.length / 3;
            Map<Integer, Integer> map = new HashMap<>();
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
}
