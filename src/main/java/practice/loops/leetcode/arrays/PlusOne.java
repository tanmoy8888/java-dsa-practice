package practice.loops.leetcode.arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,2,3};
         plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
      int number = 1 ;
      if(digits.length == 1)  number = digits[0];
        for (int i = 0; i < digits.length; i++) {
            if(i==0){
                number = digits[i]*10+digits[i+1];
                System.out.println("number = " + number);
            }else {
                if(i < digits.length-1) {
                    number = number * 10 + digits[i + 1];
                }
            }
        }
        System.out.println("number = " + number);
        // Increment it by one
        number = number+1;
        System.out.println("incremented number = " + number);
        if(number < 10){
            return new int[]{number};
        }else {
            // count digits to initialize the array

            int count = 0;
            int reminder =0 ;
            while (number != 0){
                  reminder = number%10;
                  if(number < 10){
                      count++;
                      break;
                  }
                  if(reminder !=0){
                      count++;
                  }
                  number = number/10;
            }
            System.out.println("count = " + count);
            int [] ans = new int[count];
            for (int i = 0; i < ans.length; i++) {

            }
            int element =-1;
            while (number != 0){
                reminder = number%10;
                if(number < 10){
                    System.out.println("element = " + element);
                    count++;
                    break;
                }
                if(reminder > 0){
                    element = reminder;
                    System.out.println("element = " + element);
                    count++;
                }
                number = number/10;
            }
            return null;

        }
    }
}
