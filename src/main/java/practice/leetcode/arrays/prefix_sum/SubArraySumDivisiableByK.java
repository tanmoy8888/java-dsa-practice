package practice.leetcode.arrays.prefix_sum;

import java.util.Arrays;

public class SubArraySumDivisiableByK {
    public static void main(String[] args) {
        int [] nums ={4,5,0,-2,-3,1};
        int k = 5;
        System.out.println("Output = " + subarraysDivByK(nums, k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
            if(nums[i] == k){
                count++;
            }
        }
        return count;
    }
}
