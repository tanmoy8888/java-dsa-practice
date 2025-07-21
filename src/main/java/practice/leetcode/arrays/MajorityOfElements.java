package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityOfElements {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums) {
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(Math.abs(nums[i])){
               map.put(Math.abs(nums[i]),1);
            }
            else{
                map.put(Math.abs(nums[i]),map.get(Math.abs(nums[i]))+1);
            }
        }
    }
}
