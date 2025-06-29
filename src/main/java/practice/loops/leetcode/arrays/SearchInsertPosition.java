package practice.loops.leetcode.arrays;

/**
 *  Leetcode :  35. Search Insert Position
 *
 *  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
       int [] nums = {1,3,5,6};
       int target = 5;
       System.out.println("searchInsert(nums,target) = " + searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
       int middleIndex = nums.length/2;
       int middleElement = nums[middleIndex];
        System.out.println("middleElement = " + middleElement);
        System.out.println("middleIndex = " + middleIndex);
       if(middleElement == target){
           return middleIndex;
       }
       else {
           int start;
           int end;
           if(target <middleElement){
              start =0;
              end = middleIndex-1;
               while (start < end){
                   // have tp start from here.......
           }
       }



    return 0;
    }
}
