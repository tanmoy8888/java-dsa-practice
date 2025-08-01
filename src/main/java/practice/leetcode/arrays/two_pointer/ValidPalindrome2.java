package practice.leetcode.arrays.two_pointer;

/**
 * Leetcode : 680. Valid Palindrome II
 */
public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "abced";
        System.out.println("Output = " + validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        if (s.length() == 1) return true;
        else {
            char[] arr = s.toCharArray();
            boolean palindrome = false;
            int count = 0;
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                if (arr[start] == arr[end]) {
                    start++;
                    end--;
                } else {
                    if (count > 1) {
                        return palindrome;
                    }
                    start++;
                    end--;
                    count++;
                }
            }
            return !(count > 1);
        }
    }
}
