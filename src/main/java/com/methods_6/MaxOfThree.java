package com.methods_6;

/**
 * Find max of among three int numbers using in build function
 */
public class MaxOfThree {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 10;
        int d = 12;
 /*
        int max1 = Math.max(a, b);
        int max2 = Math.max(a, c);

        int max3 = Math.max(b, c);
        int max4 = Math.max(b, a);

        if(max1 == max2){
            System.out.println("A is maximum");
        }else if(max3 == max4){
            System.out.println("B is maximum");
        }
        else {
            System.out.println("C is maximum");
        }*/
    int max = Math.max(a,Math.max(b,Math.max(c,d)));
    System.out.println(max);
    }
}
