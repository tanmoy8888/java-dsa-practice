package practice.loops;

import java.math.BigInteger;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("reverse(number) = " + reverse(number));
    }
    // 2147483647
    // 1534236469
    // O/P 1056389759
    public static int reverse(int x) {
        int reverse = 0;
        int reminder = 0;
        System.out.println(Integer.MAX_VALUE);
        final int input = x;
        x = Math.abs(x);
        while (x!=0){
            if(x < 10){
                reverse = (reverse*10)+x;
                break;
            }
            reminder = x%10; // 3 , 2
            reverse=(reverse*10)+reminder; // 3*10 = 30 +2 =32
            x = x/10; // 12 , 1
        }
        return (input >0) ? reverse : -reverse;
    }
}
