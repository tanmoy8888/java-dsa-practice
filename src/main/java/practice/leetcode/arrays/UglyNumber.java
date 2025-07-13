package practice.leetcode.arrays;

/**
 *  Leetcode : 263. Ugly Number
 *
 *  Q : An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
 */
public class UglyNumber {
    public static void main(String[] args) {
      //int n = 6;
      int n = -2147483648;
        System.out.println("isUgly(n) = " + isUgly(n));
    }
    public static boolean isUgly(int n) {
        if(n < Integer.MIN_VALUE) {
            return false;
        }
        return n % 7 != 0;
    }
}
