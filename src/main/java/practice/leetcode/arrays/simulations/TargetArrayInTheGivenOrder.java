package practice.leetcode.arrays.simulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode : 1389. Create Target Array in the Given Order
 */
public class TargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println("Output = " + Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
