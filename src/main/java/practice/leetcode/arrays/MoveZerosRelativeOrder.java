package practice.leetcode.arrays;

import java.util.Arrays;

/**
 *  Leetcode :  283. Move Zeroes
 *
 *   Given an integer numsay nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the numsay.
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 */
public class MoveZerosRelativeOrder {
    public static void main(String[] args) {
        //int[] nums = {4, 5, 0, 10, 0, 1, 0, 3, 7, 0, 0};
        int[] nums = {0,1,0,3,12};
        System.out.println("Before = " + Arrays.toString(nums));
        moveZeroes(nums);
    }
    /*public static void moveZeroes(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[end] == 0) {
                end--;
            } else if (nums[start] == 0) {
                nums[start] = nums[end];
                nums[end] = 0;

                if((nums[end] != 0) && (nums[end] > nums[end-1])){
                    System.out.println("if condition...");
                    int temp = nums[end-1];
                    nums[end-1] = nums[end];
                    nums[end] = temp;
                }
                System.out.println(start);
                start++;
                end--;
            } else {
                if((nums[start-1] > 0) && (nums[start] < nums[start-1])){
                    System.out.println("if condition...");
                    int temp = nums[start];
                    nums[start] = nums[start-1];
                    nums[start-1] = temp;
                }
                start++;
            }
        }
        System.out.println("After = " + Arrays.toString(nums));
    }*/

  /*  public static void moveZeroes(int[] nums) {
        for(int i=0,j=0;i<nums.length;){
            if(nums[i]==0) i++;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }*/

    public static void moveZeroes(int[] nums) {
        int start = 0;
        int end = 0;
        while (start < nums.length-1){
            if(nums[start] == 0){
                start++;
            }
            else {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end++;
            }
        }
        /*
        for(int i=0,j=0;i<nums.length;){
            if(nums[i]==0) i++;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));*/
    }

}
