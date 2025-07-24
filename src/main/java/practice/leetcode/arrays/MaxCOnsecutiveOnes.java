package practice.leetcode.arrays;

public class MaxCOnsecutiveOnes {
    public static void main(String[] args) {
        //int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Output = " + findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > 0) {
                    System.out.println("count = " + count);
                    if (count > maxCount) {
                        maxCount = count;
                        count = 0;
                    }
                }else{
                    count = 0;
                }
            }
        }
        return count > maxCount ? count : maxCount;
    }
}
