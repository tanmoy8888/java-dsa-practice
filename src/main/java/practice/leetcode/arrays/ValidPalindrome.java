package practice.leetcode.arrays;

import java.util.Arrays;

/**
 * 125. Valid Palindrome
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        //String s = "race car";
        // String s = "A man, a plan, a canal: Panama";
        //String s = " ";
        String s = "race a car";
        System.out.println("Input is = " + s);
        System.out.println("Output = " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        char[] arr = s.trim()
                .toLowerCase()
                .replaceAll("[^a-zA-Z0-9]", "")
                .toCharArray();
        if (arr.length == 0) return true;
        else {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                if (arr[start] == arr[end]) {
                    start++;
                    end--;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;
        }
    }
}
