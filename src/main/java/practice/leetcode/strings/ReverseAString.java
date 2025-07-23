package practice.leetcode.strings;

import java.util.Arrays;

/**
 * Leetcode : 344. Reverse String
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
    }
}
