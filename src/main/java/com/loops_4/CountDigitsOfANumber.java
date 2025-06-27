package com.loops_4;

/**
 * Find count of digits in a number.
 *  Example : 115 , count = 3
 */

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        System.out.println("countDigit() = " + countDigit(115));

    }
   /* private static int countDigit(int input){
        if(input < 10){
            return 1;
        }else {
            int count=0;
            while (input > 10){
                input = input/10;
                count++;
            }
            return (input > 0) ? count+1 : count ;
        }
    }*/

    // Optimized code
   private static int countDigit(int input){
       int count=0;
       if(input == 0) count++;
       while (input !=0){
           input/=10;
           count++;
       }
       return count;
   }
}
