package practice.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode : 228. Summary Ranges
 */
public class SummaryRange {
    public static void main(String[] args) {
      int [] nums = {0,1,2,4,5,7};
      //int [] nums = {0,2,3,4,6,8,9};
        System.out.println("summaryRanges(nums) = " + summaryRanges(nums));


    }
    public static List<String> summaryRanges(int[] nums) {
        int current = nums[0];
        int next = nums[0];
        int count =0;
  /*      while (count < nums.length-1){

            if(nums[count+1] == nums[count]+1){
                current = nums[count];
                next = nums[count+1];
                System.out.println("current if = " + current);
                System.out.println("next if = " + next);
                count++;
            }else {
                System.out.println("nums[current] else = " + nums[current]);
                count++;
            }
        }*/
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i+1] != nums[i]+1){
               list.add(String.valueOf(nums[i]));
           }
           else {
               System.out.println("iteration ,  = " + i);
               current = nums[i];
               next = nums[i+1];
               System.out.println("current = " + current);
               System.out.println("next = " + next);
               // add previous iteration current and next to list first
               list.add(""+String.valueOf(current)+"->"+String.valueOf(next));

           }
        }
    return list;
    }
}
