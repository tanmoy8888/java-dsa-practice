package com.loops;

import java.util.Scanner;

/**
 * WAP to find the highest factor of a number N (Other than N itself)
 *  Example : 1,2,3,4,5,10,20,30,60
 *  N = 60
 *  O/P => 30 (highest factor)
 */
public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factor = -1;
      /*  for (int i = 1; i <=N ; i++) {
            if(N%i == 0 && N != i){
                factor = i;
            }
        }*/
       /* for (int i = 1; i <N ; i++) {
            if(N%i == 0){
                factor = i;
            }
        }*/

        /**
         *  Optimized code , if we start iteration from back then it can reduce the number of iteration
         */
        for (int i = N-1; i >=1 ; i--) {
            if(N%i == 0){
                factor = i;
                break;
            }
        }
        System.out.println(factor);
    }
}
