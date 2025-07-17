package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

public class SubArraySum {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3};
        int[] nums = {1,1,1};
        //int k = 3;
        int k = 2;
        System.out.println("Output = " + subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
            System.out.println("nums[i] = " + nums[i]);
            if (nums[i] == k){
                System.out.println("Inside if..."+nums[i]);
                count++;
            } else if (nums[i] - nums[i-1] == k){
                System.out.println("Inside if..."+nums[i-1]+" and "+nums[i]);
                count++;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        return count;
    }
}
