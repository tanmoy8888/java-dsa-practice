package practice.leetcode.arrays;

/**
 * leetcode :  941. Valid Mountain Array
 */
public class MountainArray {
    public static void main(String[] args) {
         int [] arr = {0,3,2,1};
        //int [] arr = {1, 2, 2, 3, 2, 1};
        //int [] arr = {3,5,5};
        System.out.println("Output = " + validMountainArray(arr));

    }

    public static boolean validMountainArray(int[] arr) {
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
