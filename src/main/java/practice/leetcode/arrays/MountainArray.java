package practice.leetcode.arrays;

/**
 * leetcode :  941. Valid Mountain Array
 */
public class MountainArray {
    public static void main(String[] args) {
        //int [] arr = {0,3,2,1};
        //int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int [] arr = {1, 2, 2, 3, 2, 1};
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        //int [] arr = {3,5,5};
        System.out.println("Output = " + validMountainArray(arr));

    }

    public static boolean validMountainArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        if (arr.length <= 2 || max == arr[arr.length-1] || max == arr[0]) return false;
        else {
            boolean isMountainArray = true;
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                if (arr[start] < arr[start + 1]) {
                    start++;
                } else if (arr[end] < arr[end - 1]) {
                    end--;
                } else {
                    isMountainArray = false;
                    break;
                }
            }
            return isMountainArray;
        }
    }
}
