package practice.arrays;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5};
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                isSorted = false;
                break;
            }
        }
        System.out.println("isSorted = " + isSorted);
    }
}
