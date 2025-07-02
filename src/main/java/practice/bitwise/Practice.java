package practice.bitwise;

public class Practice {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.println("Binary of a = " + Integer.toBinaryString(a));
        System.out.println("Binary of b = " + Integer.toBinaryString(b));

        int c = a & b;

        System.out.println("c = " + c);
        System.out.println("Binary of c = " + Integer.toBinaryString(c));
    }
}
