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
    public static BigInteger reverse(int x) {
        BigInteger reverse = BigInteger.ZERO;
        BigInteger reminder = BigInteger.ZERO;
        final int input = x;
        x = Math.abs(x);
        while (x!=0){
            if(x < 10){
                reverse =  reverse.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(x));
                break;
            }
            reminder = BigInteger.valueOf(x).remainder(BigInteger.valueOf(10));
            reverse =  reverse.multiply(BigInteger.valueOf(10)).add(reminder);
            x = x/10; // 12 , 1
        }
        return (input >0) ? reverse : reverse.multiply(BigInteger.valueOf(-1));
    }
}
