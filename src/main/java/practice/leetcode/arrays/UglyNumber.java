package practice.leetcode.arrays;

/**
 * Leetcode : 263. Ugly Number
 * <p>
 * Q : An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
 */
public class UglyNumber {
    public static void main(String[] args) {
        // int n = 6;
        int n = 11;
        //int n = -2147483648;
        System.out.println("isUgly(n) = " + isUgly(n));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
