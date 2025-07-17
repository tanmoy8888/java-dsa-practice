package practice.leetcode.arrays.prefix_sum;

public class SubArraySum {
    public static void main(String[] args) {
     
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
           nums[i] = nums[i-1]+nums[i];
           if(nums[i] == k || (nums[i-1]+nums[i]) == k){
               count++;
           }
        }
        return count;
    }
}
