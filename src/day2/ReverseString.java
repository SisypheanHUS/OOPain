package day2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = sc.nextLine();
        testReverseString(inStr);
    }

    public static void testReverseString(String inStr) {
        System.out.println("The reverse of the String \"" + inStr + " \" is \"" + reverseString(inStr) + "\"");
    }

    public static String reverseString(String inStr) {
        String result = "";
        for (int i = inStr.length() - 1; i >= 0; i--) {
            result += inStr.charAt(i);
        }
        return result;
    }
}
