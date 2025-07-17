package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

/**
 *  Leetcode : 560. Subarray Sum Equals K
 *
 */

public class SubArraySumDivisiableByK {
    public static void main(String[] args) {
        int [] nums ={4,5,0,-2,-3,1};
        int k = 5;
        System.out.println("Output = " + subarraysDivByK(nums, k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
            if(nums[i]%k == 0){
                count++;
            }
        }
        System.out.println("Prefix Sum = " + Arrays.toString(nums));
        return count;
    }
}
