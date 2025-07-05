package practice.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode :  41. First Missing Positive
 * <p>
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 * <p>
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * Example 2:
 * <p>
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * Example 3:
 * <p>
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 */
public class FindMissingPositiveInteger {
    public static void main(String[] args) {
        // int [] nums = {3,4,-1,1};
         //int [] nums = {2,1};
       // int [] nums = {1,2,0};
        int [] nums = {7,8,9,11,12};
        //int[] nums = {1};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("Output  = " + firstMissingPositive(nums));
    }

   /* public static int firstMissingPositive(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int missing = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    map.put(nums[i], 1);
                }
            }
            for (int i = 1; i <= nums.length+1; i++) {
                if (!map.containsKey(i)) {
                    missing = i;
                    break;
                }
            }
            return missing;
    }*/

    // Another approach [from leetcode discussion]

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        int smallest=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==smallest){
                smallest++;
            }
        }
        return smallest;
    }
}
