package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *  Leetcode : 1346. Check If N and Its Double Exist
 *
 */
public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        //int [] arr = {10,2,5,3};
        int [] arr = {3,1,7,11};
        System.out.println("checkIfExist(arr) = " + checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean exists = false;
        for (int i = 0; i < arr.length; i++) {
           map.put(arr[i], 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(2*arr[i])){
                System.out.println("arr[i] = " + arr[i]);
                exists = true;
                break;
            }
        }
        return exists;
    }

}
