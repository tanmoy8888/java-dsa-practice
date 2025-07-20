package practice.leetcode.math;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NthDigit {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Output = " + findNthDigit(n));
    }

    public static int findNthDigit(int n) {
        System.out.println("n = " + n);
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
            if (i <= 9) {
                list.add(i);
            } else {
                List<Integer> digits = new LinkedList<>();
                System.out.println("Inside else : " + i);
                int reminder = 0;
                while (n != 0) {
                    if (n < 10) {
                        digits.add(n);
                        break;
                    }
                    reminder = n % 10;
                    digits.add(reminder);
                    n = n / 10;
                }
                Collections.reverse(digits);
                System.out.println("digits = " + digits);
                list.addAll(digits);
            }

        }
        System.out.println("list = " + list);
        return list.get(n);
    }
}
