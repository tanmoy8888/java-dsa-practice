package practice.leetcode.arrays.prefix_sum;

/**
 *  Leetcode : 303. Range Sum Query - Immutable
 */

public class RangeSumQuery {
    int[] nums;
    public static void main(String[] args) {
      int [] nums = {-2, 0, 3, -5, 2, -1};
      RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);

    }
    public RangeSumQuery(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if(left == 0) return nums[right];
        else{
            return nums[right] - nums[left-1];
        }
    }
}
