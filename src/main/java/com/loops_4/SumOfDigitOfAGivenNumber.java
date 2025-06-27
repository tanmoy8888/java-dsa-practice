package com.loops_4;

public class SumOfDigitOfAGivenNumber {
    public static void main(String[] args) {
        int N = 56;
        int reminder =0;
        int sum =0;
        while (N > 0){
            reminder = N%10;
            if(N < 10){
               sum=sum+N;
                break;
            }else {
                sum = sum+reminder;
            }
            N = N/10;
        }
    }
}
