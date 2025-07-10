package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode : 1346. Check If N and Its Double Exist
 */
public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        //int [] arr = {10,2,5,3};
        int [] arr = {2,3,3,0,0};
        // int [] arr = {3,1,7,11};
        // int [] arr = {0,-2,2};
       // int[] arr = {0, 0};
        System.out.println("checkIfExist(arr) = " + checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length-1;){
            map.put(arr[i]*2, null);
            if(arr[i]%2==0){
                map.put(arr[i]/2, null);
            }
            i++;
            if(map.containsKey(arr[i])){
                return true;
            }
        }
        return false;
    }
}
