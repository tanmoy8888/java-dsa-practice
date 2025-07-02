package practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Target Sum :
 *  Find the pairs of target sum in the gi/
 *
 */
public class Triplets {
    public static void main(String[] args) {
        int [] arr = {4,6,3,5,8,2};
        int target = 7;
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(target-arr[i]);
                list.add(ans);
            }else {
                map.put(arr[i],1);

        System.out.println("list = " + list);
    }

}
