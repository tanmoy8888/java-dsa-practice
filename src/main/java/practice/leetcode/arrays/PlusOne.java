package practice.leetcode.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //int [] digits = {1,2,3};
        //int [] digits = {9};
        int [] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Input array = " + Arrays.toString(digits));
        System.out.println("Output array = " + Arrays.toString(plusOne(digits)));
        ;
    }

    public static int[] plusOne(int[] digits) {
        long number = 1 ;
        if(digits.length == 1) {
            number = (long) digits[0];
        }else {
            for (int i = 0; i < digits.length; i++) {
                if (i == 0) {
                    number = (long)digits[i] * 10 + (long)digits[i + 1];
                } else {
                    if (i < digits.length - 1) {
                        number = number * 10 + (long)digits[i + 1];
                    }
                }
            }
        }
        long incrementedNumber = number+1;
        long num = incrementedNumber;
        if(incrementedNumber < 10){
            int incrementedNumber1 = (int) incrementedNumber;
            return new int[]{incrementedNumber1};
        }else {
            int count = 0;
            while(incrementedNumber > 0){
                long reminder = incrementedNumber%10;
                count++;
                incrementedNumber = incrementedNumber/10;
            }
            int [] ans = new int[count];
            long reminderNew =-1;
            long digit = -1;
            int index = ans.length-1;
            while (num!=0){
                reminderNew = num%10;
                if(reminderNew > 0){
                    digit = reminderNew;
                    ans[index] = (int)digit;
                }
                if(num < 10){
                    break;
                }
                num = num/10;
                index--;
            }
            return ans;
        }
    }
}
