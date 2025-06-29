package practice.loops.leetcode.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
      /*  int [] nums = {3,2,2,3};
        int val = 3;
        // O/P = > 2*/

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        // O/P = > 2

        System.out.println("removeElement(nums,val) = " + removeElement(nums, val));
    }

    /*public static int removeElement(int[] nums, int val) {
      int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }*/

    public static int removeElement(int[] nums, int val) {
        int start =0;
        int end =nums.length-1;
        while (start < end){
            if (nums[start] == val){
                nums[start] = nums[end-1];
                end--;
            }
            else {
                start++;
            }
        }
        return end;
    }
}
