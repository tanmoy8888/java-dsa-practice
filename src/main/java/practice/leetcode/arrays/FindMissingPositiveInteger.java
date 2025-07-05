package practice.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  Leetcode :  41. First Missing Positive
 */
public class FindMissingPositiveInteger {
    public static void main(String[] args) {
        //int [] nums = {3,4,-1,1};
        int [] nums = {1,2,0};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("Output  = " + firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing = -1;
        int current = -1;
      //  Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > 0){
                current = nums[i];
                System.out.println("current = " + current);
                if(current +1 != nums[i+1]){
                    System.out.println("In if condition");
                    missing = current+1;
                    System.out.println("missing = " + missing);
                    break;
                }
            }
        }
        System.out.println("missing = " + missing);
        return missing;
    }
}
