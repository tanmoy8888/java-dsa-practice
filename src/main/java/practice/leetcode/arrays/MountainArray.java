package practice.leetcode.arrays;

/**
 *  leetcode :  941. Valid Mountain Array
 */
public class MountainArray {
    public static void main(String[] args) {
        int [] arr = {0,3,2,1};
       // int [] arr = {1, 2, 2, 3, 2, 1};
        //int [] arr = {3,5,5};
        System.out.println("Output = " + validMountainArray(arr));

    }
    public static boolean validMountainArray(int[] arr) {
        boolean isMountainArray = true;
        if (arr.length < 3) return false;
        else {
            int maxElement = arr[0];
            int indexOfMaxElement = 0;
            for (int i = 1; i < arr.length; i++) {
                if(maxElement <= arr[i]){
                    maxElement = arr[i];
                    indexOfMaxElement = i;
                }
            }
            System.out.println("maxElement = " + maxElement);
            System.out.println("indexOfMaxElement = " + indexOfMaxElement);
            int start = indexOfMaxElement-1;
            int end = indexOfMaxElement+1;
            //int maxLeft = arr[start];
            //int maxRight = arr[end];
            int count = 0;
             while (start > 0 || (end < arr.length-1)){
                 System.out.println("count = " + count);
                 if(arr[start] < arr[start+1]){
                     System.out.println("start = " + start);
                     start++;
                 }
                 else if (arr[end] < arr[end-1]) {
                     System.out.println("end = " + end);
                     end--;
                 }
                 else {
                     isMountainArray =false;
                     System.out.println("isMountainArray = " + isMountainArray);
                     break;
                 }
                 count++;
             }
        }
        return isMountainArray;
    }
}
