package com.pattern_printing_5;

/**
 *
 *  Print this below pattern
 *    m = 4
 *    n = 6
 *      * * * * * *
 *      *         *
 *      *         *
 *      * * * * * *
 *
 */
public class ThirteenthPattern {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
               if(i == 1 || i == 4 || j == 1 || j ==6){
                   System.out.print("*"+" ");
               }else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
