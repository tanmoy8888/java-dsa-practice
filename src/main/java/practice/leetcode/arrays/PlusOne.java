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
        int number = 1 ;
        if(digits.length == 1) {
            number = digits[0];
        }else {
            for (int i = 0; i < digits.length; i++) {
                if (i == 0) {
                    number = digits[i] * 10 + digits[i + 1];
                } else {
                    if (i < digits.length - 1) {
                        number = number * 10 + digits[i + 1];
                    }
                }
            }
        }
        int incrementedNumber = number+1;
        int num = incrementedNumber;
        if(incrementedNumber < 10){
            return new int[]{incrementedNumber};
        }else {
            int count = 0;
            while(incrementedNumber > 0){
                int reminder = incrementedNumber%10;
                count++;
                incrementedNumber = incrementedNumber/10;
            }
            int [] ans = new int[count];
            int reminderNew =-1;
            int digit = -1;
            int index = ans.length-1;
            while (num!=0){
                reminderNew = num%10;
                if(reminderNew > 0){
                    digit = reminderNew;
                    ans[index] = digit;
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
