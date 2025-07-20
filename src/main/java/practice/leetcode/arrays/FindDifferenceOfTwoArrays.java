package practice.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println("Output = " + findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> num2Set = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        System.out.println("set = " + set);
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(nums2[i])) {
                num2Set.add(nums2[i]);
            }
        }
        System.out.println("num2Set = " + num2Set);
        set.removeAll(nums2);
        list.add(new ArrayList<>(set));
        list.add(new ArrayList<>(num2Set));
        return list;
    }
}
