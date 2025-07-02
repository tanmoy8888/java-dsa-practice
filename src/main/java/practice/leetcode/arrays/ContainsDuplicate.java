package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode   :   217. Contains Duplicate
 *
 */
public class ContainsDuplicate {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4};
        System.out.println("containsDuplicate(nums) = " + containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                isDuplicate = true;
                break;
            }else {
                map.put(nums[i],1);
            }
        }
        return isDuplicate;
    }

}
