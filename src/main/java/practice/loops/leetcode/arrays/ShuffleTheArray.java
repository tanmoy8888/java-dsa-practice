package practice.loops.leetcode.arrays;

/**
 *   1470. Shuffle the Array
 *
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 *
 */

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
