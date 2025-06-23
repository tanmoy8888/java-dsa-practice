package com.if_else;

/**
 * Take input of three coordinates , write a program to check,
   whether they will fall on a straight line or not.
 */

import java.util.Scanner;

public class ThreePointsAreInStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

        if(m1 == m2){
            System.out.println("This will be on a straight line");
        }else {
            System.out.println("This will not be on a straight line");
        }
    }
}
