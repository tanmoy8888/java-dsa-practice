package com.loops_4;

public class PrintingTable {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Table of "+number+" , "+i+" is "+i*number);
        }*/

        // Another approach
       /* for (int i = 19; i <= 190; i++) {
            if(i % 19 ==0){
                System.out.println(i);
            }
        }*/

        // Further optimization ,

        for (int i = 19; i <= 190; i=i+19) {
                System.out.println(i);
            }
        }

}
