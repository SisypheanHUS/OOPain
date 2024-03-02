package day2;

import java.util.Scanner;

public class StringAndCharacterExercise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testReverseString();
        testCountVowelsDigits();
        testPhoneKeyPad();
        testCipherCaesarCode();
        testDecipherCaesarCode();
        testCheckHexString();
        testBinaryToDecimal();
        testHexadecimalToDecimal();
        testOctalToDecimal();
        testRadixNToDecimal();
    }

    // 1. Write a Java method to reverse a string
    public static void testReverseString() {
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
        System.out.println("Enter a string: ");
        String inStr = sc.nextLine().toLowerCase();
        System.out.println("The sequence of keypad digits for the input \"" + inStr + " \" is \"" + PhoneKeyPad(inStr) + "\"");
    }

    static String cipherCaesarCode(String inStr) {
        String result = "";
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if (inChar >= 'A' && inChar <= 'W') {
                result += (char) (inChar + 3);
            } else if (inChar >= 'X' && inChar <= 'Z') {
                result += (char) (inChar - 23);
            }
        }
        return result;
    }
    static void testCipherCaesarCode(){
        System.out.println("Enter a string:");
        String inStr = sc.nextLine().toUpperCase();
        System.out.println("The Caesar code of the input \"" + inStr + "\" is \"" + cipherCaesarCode(inStr) + "\"" );
    }

    static String decipherCaesarCode(String inStr){
        String result = "";
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if (inChar >= 'D' && inChar <= 'Z') {
                result += (char) (inChar - 3);
            } else if (inChar >= 'A' && inChar <= 'C') {
                result += (char) (inChar + 23);
            }
        }
        return result;
    }

    static void testDecipherCaesarCode(){
            System.out.println("Enter a string:");
            String inStr = sc.nextLine().toUpperCase();
            System.out.println("The Caesar code of the input \"" + inStr + "\" is \"" + decipherCaesarCode(inStr) + "\"" );
    }

    static  boolean CheckHexString(String inStr){
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if(!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))){
                return false;
            }
        }
        return true;
    }

    static void testCheckHexString(){
        System.out.println("Enter a string:");
        String inStr = sc.nextLine().toUpperCase();
        System.out.println("The input \"" + inStr + "\" is " + (CheckHexString(inStr) ?  "a hex string" : "not a hex String "));
    }

    static int binaryToDecimal(String inStr){
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if(inChar == '1'){
                result = result * 2 + 1;
            }
            else if(inChar == '0'){
                result = result * 2;
            }
            else {
                return -1;
            }
        }
        return result;
    }


    static void testBinaryToDecimal(){
        System.out.println("Enter a binary string:");
        String inStr = sc.nextLine();
        if(binaryToDecimal(inStr) == -1)
            System.out.println("error: invalid binary string \"" + inStr + "\"");
        else {
            System.out.println("The decimal value of the input \"" + inStr + "\" is :" + binaryToDecimal(inStr));
        }
    }

    static int HexadecimalToDecimal(String inStr){
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if(inChar >= '0' && inChar <= '9'){
                result += (inChar - '0') * Math.pow(16, inStr.length() - 1 - i);
            }
            else if(inChar >= 'A' && inChar <= 'F'){
                result += (inChar - 'A' + 10) * Math.pow(16, inStr.length() - 1 - i); //1a = 1*16^1 + 10*16^0
            }
            else{
                return -1;
            }
        }
        return result;
    }

    static void testHexadecimalToDecimal(){
        System.out.println("Enter a hexadecimal string:");
        String inStr = sc.nextLine().toUpperCase();
        if(HexadecimalToDecimal(inStr) == -1)
            System.out.println("error: invalid hexadecimal string \"" + inStr + "\"");
        else {
            System.out.println("The decimal value of the input \"" + inStr + "\" is :" + HexadecimalToDecimal(inStr));
        }
    }

    static int octalToDecimal(String inStr){
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if(inChar >= '0' && inChar <= '7'){
                result += (inChar - '0') * Math.pow(8, inStr.length() - 1 - i); //147 = 1*8^2 + 4*8^1 + 7*8^0
            }
            else{
                return -1;
            }
        }
        return result;
    }

    static void testOctalToDecimal(){
        System.out.println("Enter an octal string:");
        String inStr = sc.nextLine();
        if(octalToDecimal(inStr) == -1)
            System.out.println("error: invalid octal string \"" + inStr + "\"");
        else {
            System.out.println("The decimal value of the input \"" + inStr + "\" is :" + octalToDecimal(inStr));
        }
    }

    static int radixNToDecimal(String octalStr,int radix){
        int result = 0;
        for (int i = 0; i < octalStr.length(); i++) {
            char inChar = octalStr.charAt(i);
            if(inChar >= '0' && inChar <= '9'){
                result += (inChar - '0') * Math.pow(radix, octalStr.length() - 1 - i); //147 = 1*8^2 + 4*8^1 + 7*8^0
            }
            else if(inChar >= 'A' && inChar <= 'F'){
                result += (inChar - 'A' + 10) * Math.pow(radix, octalStr.length() - 1 - i); //1a = 1*16^1 + 10*16^0
            }
            else{
                return -1;
            }
        }
        return  result;
    }

    static void testRadixNToDecimal(){
        System.out.println("Enter the radix : ");
        int radix = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the string : ");
        String octalStr = sc.nextLine().toUpperCase();
        System.out.println("The equivalent decimal number \"" +octalStr +"\" is : " +radixNToDecimal(octalStr,radix));
    }


}