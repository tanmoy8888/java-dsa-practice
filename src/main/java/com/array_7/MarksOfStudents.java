package com.array_7;

/**
 *  Given an array of marks of students if their number is less than 35 print their roll numbers. Roll number is their index.
 */
public class MarksOfStudents {
    public static void main(String[] args) {
        int [] arr = {50,30,10,40,11,34,35,80,90,62};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println("Roll is  = " + i);
            }
        }
    }
}
