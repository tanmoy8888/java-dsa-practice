package practice.leetcode.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //int [] digits = {1,2,3};
        //int [] digits = {4,3,2,1};
        int [] digits = {9};
        System.out.println("Input array = " + Arrays.toString(digits));
        System.out.println("Output array = " + Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
      int number = 1 ;
      if(digits.length == 1) {
          System.out.println("inside if...single digit...");
          number = digits[0];
      }else {
          for (int i = 0; i < digits.length; i++) {
              if (i == 0) {
                  number = digits[i] * 10 + digits[i + 1];
                  //      System.out.println("number = " + number);
              } else {
                  if (i < digits.length - 1) {
                      number = number * 10 + digits[i + 1];
                  }
              }
          }
      }
       // System.out.println("number = " + number);
        // Increment it by one
        int incrementedNumber = number+1;
        System.out.println("incrementedNumber = " + incrementedNumber);
        int num = incrementedNumber;
       // System.out.println("incremented number = " + incrementedNumber);
        if(incrementedNumber < 10){
            System.out.println("Inside if incrementedNumber < 10.......");
            return new int[]{incrementedNumber};
        }else {

            // count digits to initialize the array

            int count = 0;
            int reminder =0 ;
            while (num!=0){
                reminder = num%10;
                if(reminder > 0){
                    // System.out.println("number = " + num);
                    // System.out.println("digit 1 = " + digit);
                    count++;
                }
                if(num < 10){
                    //  digit = number;
                    // System.out.println("digit 2 = " + digit);
                    count++;
                    break;
                }
                num = num/10;
            }
            System.out.println("count = " + count);
            int [] ans = new int[count];
           /* for (int i = 0; i < ans.length; i++) {

            }*/
           // System.out.println("incrementedNumber = " + incrementedNumber);
            int reminderNew =-1;
            int digit = -1;
            int index = ans.length-1;
            while (num!=0){
                reminderNew = num%10;
                if(reminderNew > 0){
                   // System.out.println("number = " + num);
                    digit = reminderNew;
                    ans[index] = digit;
                   // System.out.println("digit 1 = " + digit);
                }
                if(num < 10){
                    //  digit = number;
                    // System.out.println("digit 2 = " + digit);
                    break;
                }
                num = num/10;
                index--;
            }
            return ans;

        }
    }
}
