package practice.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  Leetcode :   26. Remove Duplicates from Sorted Array
 *
 *  Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 *
 *
 *
 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        //int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int [] nums = {1,2,3,4,5};
        //int [] nums = {1,2};
        //int [] nums = {1};
        System.out.println("Input array :: "+Arrays.toString(nums));
        System.out.println("Unique Elements :: "+removeDuplicates(nums));
    }

   /* public static int removeDuplicates(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
          if(!map.containsKey(nums[i])) {
              map.put(nums[i],1);
              nums[count] = nums[i];
              count++;
          }
        }
        return count;
    }*/

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
          if(nums[count] != nums[i]){
              count++;
              nums[count] = nums[i];
          }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        return count+1;
    }
}
