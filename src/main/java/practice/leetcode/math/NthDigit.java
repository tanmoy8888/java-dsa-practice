package practice.leetcode.math;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NthDigit {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Output = " + findNthDigit(n));
    }

    public static int findNthDigit(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i <= 9) {
                list.add(i);
            } else {
                List<Integer> digits = new LinkedList<>();
                int number = i;
                int reminder = 0;
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
    }
}
