package practice.leetcode.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        //String s = "Hello World";
        String s = "   fly me   to   the moon  ";
        System.out.println("Output = " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        if (arr.length <= 0) return 1;
        else return arr[arr.length - 1].length();
    }
}
