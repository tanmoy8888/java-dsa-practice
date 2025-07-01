package practice.leetcode.arrays;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //int [] digits = {1,2,3};
        //int [] digits = {9};
       // int [] digits = {9,8,7,6,5,4,3,2,1,0};
        int [] digits= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println("Input array = " + Arrays.toString(digits));
        System.out.println("Output array = " + Arrays.toString(plusOne(digits)));
        ;
    }

    public static int[] plusOne(int[] digits) {
        BigInteger number = BigInteger.ONE ;
        System.out.println("digits.length = " + digits.length);
        if(digits.length == 1) {
            number = BigInteger.valueOf(digits[0]);
        }else {
            for (int i = 0; i < digits.length; i++) {
                if (i == 0) {
                    number = BigInteger.valueOf(digits[i]*10).add(BigInteger.valueOf(digits[i + 1]));
                } else {
                    if (i < digits.length - 1) {
                        number = number.multiply(BigInteger.valueOf(10)).add (BigInteger.valueOf(digits[i + 1]));
                    }
                }
            }
        }
        BigInteger incrementedNumber = number.add(BigInteger.ONE);
        BigInteger num = incrementedNumber;
        System.out.println("num = " + num);
        if(!(incrementedNumber.compareTo(BigInteger.valueOf(10)) > 0)){
            System.out.println("inside true....");
            int incrementedNumber1 = (int) incrementedNumber.intValue();
            return new int[]{incrementedNumber1};
        }else {
            int count = 0;
            System.out.println("inside false....");
            while(incrementedNumber.compareTo(BigInteger.ZERO) > 0){
                BigInteger reminder = incrementedNumber.mod(BigInteger.TEN);
                count++;
                incrementedNumber = incrementedNumber.divide(BigInteger.valueOf(10));
            }
            System.out.println("count = " + count);
            int [] ans = new int[count];
            BigInteger reminderNew;
            int digit = -1;
            int index = ans.length-1;
            while (num.compareTo(BigInteger.ZERO) >0){
                reminderNew = num.mod(BigInteger.TEN);
                if(reminderNew.compareTo(BigInteger.ZERO) > 0){
                    digit = reminderNew.intValue();
                    System.out.println("digit = " + digit);
                    ans[index] = digit;
                    System.out.println("ans[index] = " + ans[index]);
                }
                if(num.compareTo(BigInteger.TEN) < 0){
                    System.out.println("inside break...");
                    ans[index] = num.intValue();
                    break;
                }
                num = num.divide(BigInteger.TEN);
                System.out.println("num = " + num);
                index--;
            }
            return ans;
        }
    }
}
