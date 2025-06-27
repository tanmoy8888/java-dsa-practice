package practice.loops;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reminder = 0;
        int sum =0;
        while (number>0){
            reminder = number%10;
            if(number <10){
                sum += number;
                break;
            }
            sum+= reminder;
            number= number/10;
        }
        System.out.println("sum = " + sum);
    }
}
