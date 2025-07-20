package practice.leetcode.math;


import java.util.*;

public class NthDigit {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Output = " + findNthDigit(n));
    }

    /*public static int findNthDigit(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i <= 9) {
                list.add(i);
            } else {
                List<Integer> digits = new LinkedList<>();
                int number = i;
                int reminder;
                while (number != 0) {
                    if (number < 10) {
                        digits.add(number);
                        break;
                    }
                    reminder = number % 10;
                    digits.add(reminder);
                    number /= 10;
                }
                Collections.reverse(digits);
                list.addAll(digits);
            }
        }
        return list.get(n - 1);
    }*/
    // Another approach

    public static int findNthDigit(int n) {
        StringBuilder number = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            number.append(i);
        }
        return number.charAt(n - 1) - '0';
    }
}
