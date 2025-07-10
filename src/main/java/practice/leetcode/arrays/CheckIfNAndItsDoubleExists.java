package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode : 1346. Check If N and Its Double Exist
 */
public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int [] arr = {10,2,5,3};
        // int [] arr = {3,1,7,11};
        // int [] arr = {0,-2,2};
       // int[] arr = {0, 0};
        System.out.println("checkIfExist(arr) = " + checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean exists = false;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], count);
            }
        }
        System.out.println("map.entrySet() = " + map.entrySet());
        if (map.size() == 1 && map.get(0) == 2) return true;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(2 * arr[i]) && arr[i] != 0) {
                    System.out.println("arr[i] = " + arr[i]);
                    exists = true;
                    break;
                }
            }
            return exists;
        }
    }
}
