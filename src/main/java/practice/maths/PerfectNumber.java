package practice.maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        System.out.println("Output = " + findPerfectNumbers(range));
    }

    private static List<Integer> findPerfectNumbers(int range) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i <= range; i++) {
            if (isPerfectNumber(i)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    private static boolean isPerfectNumber(int number) {
        int sum =0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum+=i;
            }
        }
        return number == sum;
    }
}
