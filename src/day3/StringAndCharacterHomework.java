package day3;

import java.util.Scanner;

public class StringAndCharacterHomework {

    public static void main(String[] args) {
        testExchangeCipher();
        testIsPalindrome();
        testIsPalindromicPharse();
    }

    // 1. Write a program to encrypt a string using the exchange cipher. The program shall ask the user to enter a string and display the encrypted string. The exchange cipher is a simple substitution cipher where the first half of the alphabet is exchanged with the second half of the alphabet. For example, A is exchanged with Z, B is exchanged with Y, C is exchanged with X, and so on. The program shall convert the string to uppercase before encrypting it.
    static void testExchangeCipher(){
        System.out.print("Enter a plaintext string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println("The cipher string is : " + exchangeCipher(str));
    }
    static String exchangeCipher(){
        return "";
    }
    static String exchangeCipher(String inStr){
        String result = "";
        for(int i = 0; i < inStr.length(); ++i){
            int temp;
            if(inStr.charAt(i) - 'A' < 'Z' / 2) {
                temp = inStr.charAt(i) - 'Z' / 2 - 'A';
                result += (char) ('Z' / 2 - temp);
            }
            else {
                temp = inStr.charAt(i) - 'A';
                result += (char) ('Z' / 2 + temp);
            }
        }
        return result;
    }
    // 2. Write a program to check if a string is a palindrome. The program shall ask the user to enter a string and display whether the string is a palindrome or not. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. For example, "madam" is a palindrome.

    static boolean isPalindrome(String str){
        int len = str.length() - 1;
        for(int i = 0; i < str.length() / 2; ++i){
            if(str.charAt(i) != str.charAt(len - i)){
                return false;
            }
        }
        return true;
    }
    static void testIsPalindrome(){
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The string is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
    }
    // 3. Write a program to check if a string is a palindromic phrase. The program shall ask the user to enter a string and display whether the string is a palindromic phrase or not. A palindromic phrase is a phrase that reads the same forward and backward, ignoring spaces, punctuation, and capitalization. For example
    static boolean isPalindromicPharse(String str){
        str = str.toUpperCase();
        String temp = "";
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A'){
                temp += str.charAt(i);
            }
        }
        return isPalindrome(temp);
    }
    static void testIsPalindromicPharse(){
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The string is " + (isPalindromicPharse(str) ? "a palindromic phrase" : "not a palindromic phrase"));
    }
}
