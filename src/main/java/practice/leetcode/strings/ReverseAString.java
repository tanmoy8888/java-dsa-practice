package practice.leetcode.strings;

import java.util.Arrays;

/**
 * Leetcode : 344. Reverse String
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 *
 */

public class ReverseAString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        char temp = ' ';
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println("Output = " + Arrays.toString(s));
    }
}
