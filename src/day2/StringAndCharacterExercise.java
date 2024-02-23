package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringAndCharacterExercise {
    public static void main(String[] args) {
        testReverseString();
        testCountVowelsDigits();
        testPhoneKeyPad();
    }

    // 1. Write a Java method to reverse a string
    public static void testReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = sc.nextLine();
        System.out.println("The reverse of the String \"" + inStr + " \" is \"" + reverseString(inStr) + "\"");
    }

    public static String reverseString(String inStr) {
        String result = "";
        for (int i = inStr.length() - 1; i >= 0; i--) {
            result += inStr.charAt(i);
        }
        return result;
    }
    // 2. Write a Java method to count all vowels in a string

    public static int countVowels(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void testCountVowelsDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = sc.nextLine().toLowerCase();
        System.out.println("The number of vowels in the String " + inStr + " is " + countVowels(inStr) + "(" + Math.round(countVowels(inStr) * 100.0 / inStr.length()) + "%)");
        System.out.println("The number of digits in the String " + inStr + " is " + countDigits(inStr) + "(" + Math.round(countDigits(inStr) * 100.0 / inStr.length()) + "%)");
    }

    // 3. Write a java program to convert a given string into a sequence of keypad digits.

    public static String PhoneKeyPad(String inStr) {
        String result = "";
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            switch (inChar) {
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;
                default:
                    result += inChar;
            }
        }
        return result;
    }

    static void testPhoneKeyPad() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = sc.nextLine().toLowerCase();
        System.out.println("The sequence of keypad digits for the input \"" + inStr + " \" is \"" + PhoneKeyPad(inStr) + "\"");
    }




}
