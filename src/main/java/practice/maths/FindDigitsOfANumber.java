package practice.maths;

public class FindDigitsOfANumber {
    public static void main(String[] args) {
        int number = 123;
        int reminder = -1;
        int digit = -1;
        while (number!=0){
            reminder = number%10;
            if(reminder > 0){
                System.out.println("number = " + number);
                digit = reminder;
                System.out.println("digit 1 = " + digit);
            }
            if(number < 10){
              //  digit = number;
               // System.out.println("digit 2 = " + digit);
                break;
            }
            number = number/10;
        }
    }
}
