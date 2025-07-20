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
        Set<Integer> set1 = new HashSet<>();
        for (int k : nums1) {
            set1.add(k);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int j : nums2) {
            set2.add(j);
        }
        for (int i = 0; i < set1.size(); i++) {
            if (!set1.contains(nums2[i])) {
                num2Set.add(nums2[i]);
            }
        }
        set1.removeAll(set2);
        list.add(new ArrayList<>(set1));
        list.add(new ArrayList<>(num2Set));
        return list;
    }
}
