package practice.maths;

public class FindDigitsOfANumber {
    public static void main(String[] args) {
        int number = 10;
        int reminder = -1;
        int digit = -1;
        int count = 0;
        while (number >=0){
            reminder = number%10;
            if(reminder > 0){
                System.out.println("number = " + number);
                digit = reminder;
                System.out.println("digit 1 = " + digit);
                count++;
            }
            if(number < 10){
              //  digit = number;
               // System.out.println("digit 2 = " + digit);
                count++;
                break;
            }
            number = number/10;
        }
        System.out.println("count = " + count);
    }
}
