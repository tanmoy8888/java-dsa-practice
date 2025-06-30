package practice.leetcode.math;

import java.util.Scanner;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("input ---->" + number);
        System.out.println("isPalindrome(number) = " + isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int reminder = 0;
        final int number = x;
        if (x < 0) {
            return false;
        } else {
            while (x != 0) {
                if (x < 10) {
                    reverse = reverse * 10 + x;
                    break;
                }
                reminder = x % 10;
                reverse = reverse * 10 + reminder;
                x = x / 10;
            }
        }
        return number == reverse;
    }
}
