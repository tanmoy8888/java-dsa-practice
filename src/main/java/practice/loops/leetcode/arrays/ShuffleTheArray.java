package practice.loops.leetcode.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println("Arrays.toString(shuffle(nums, n)) = " + Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        int count =0;
        for(int i =0 ;i < n ;i++){
            ans[count] = nums[i];
            ans[count+1] = nums[i+n];
            count +=2;
        }
        return ans;
    }

}
