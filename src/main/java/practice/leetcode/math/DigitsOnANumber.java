package practice.leetcode.math;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DigitsOnANumber {
    public static void main(String[] args) {
        int n = 15;
        List<Integer> digits = new LinkedList<>();
        int reminder = 0;
        while (n != 0) {
            if(n <10){
                digits.add(n);
                break;
            }
            reminder = n % 10;
            digits.add(reminder);
            n = n/10;
        }
        Collections.reverse(digits);
        System.out.println("digits = " + digits);
    }
}
