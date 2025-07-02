package practice.arrays;

public class FindLastOccurrenceIndexOfAnElement {
    public static void main(String[] args) {
        int [] nums = {5,6,5,3,5,4};
        int target = 5;
        int index  = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                index = i;
            }
        }
        System.out.println("index = " + index);
    }
}
