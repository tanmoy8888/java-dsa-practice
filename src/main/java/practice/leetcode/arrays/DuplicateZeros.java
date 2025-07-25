package practice.leetcode.arrays;

/*

Leetcode : 1089. Duplicate Zeros

 */
public class DuplicateZeros {
    public static void main(String[] args) {
     int [] arr  = {1,0,2,3,0,4,5,0};
     duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int start = i+1;
                int end = arr.length-1;
                int temp = arr[start];
                arr[start] = 0;
                start++;
                while (start > end){
                    temp = arr[start+1];

                }
            }
        }
    }
}
