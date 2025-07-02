package practice.arrays;

import java.util.*;

/**
 * Target Sum in an array : (GFG)
 *  Find the pairs of target sum in the gi/
 *
 */
public class Triplets {
    public static void main(String[] args) {
        int [] arr = {5,0,1,2,4,3,9,10};
        Arrays.sort(arr);
        int target = 6;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int start = i+1;
            int end = arr.length-1;
            while (start< end){
                if(arr[i]+arr[start]+arr[end] == target){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[start]);
                    triplet.add(arr[end]);
                    list.add(triplet);
                    start++;
                    end--;
                }
                else if (arr[i]+arr[start]+arr[end]  < target){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        System.out.println("list = " + list);
    }

}
