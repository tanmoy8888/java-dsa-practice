package com.loops_4;

public class ASCIIValuesOfAlphabets {
    public static void main(String[] args) {
      int i = 65;
      while (i > 0){
          char c = (char) i;
          System.out.println("ASCII value of :: " + c +", is :: "+i);
          i++;
          if(i >= (65+26)){
              break;
          }
      }
    }
}
