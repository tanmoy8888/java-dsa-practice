package practice.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode :  268. Missing Number
 * 
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
