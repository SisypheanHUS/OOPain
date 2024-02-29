package day2;

import java.util.Scanner;

public class ArrayExercise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = createArray(sc);
        PrintArray(arr);
        int[] studentGrade = generateStudentGrade(sc);
        simpleGradeStatistics(studentGrade);
        testHexadecimalToBinary();
        testDecimalToHexadecimal();
    }

    static void PrintArray(int[] arr) {
        System.out.print("The value are : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + ", ");
        }
        System.out.println("]");
    }

    static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items : ");
        int NUM_ITEMS = Integer.parseInt(in.next());
        int[] arr = new int[NUM_ITEMS];
        System.out.print("Enter the value of all the item (seprate by space) : ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }

    static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students : ");
        int numStudents = Integer.parseInt(in.next());
        int[] arr = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        return arr;
    }


    static void simpleGradeStatistics(int[] arr) {
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average = average / arr.length;
        System.out.println("The average grade is : " + average);
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("The minimum grade is : " + minimum);
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("The maximum grade is : " + maximum);
    }

    static String hexadecimalToBinary(String hexStr, String[] hexStrArr) {
        String binaryStr = "";
        for (int i = 0; i < hexStr.length(); i++) {
            char inChar = hexStr.charAt(i);
            if (inChar >= '0' && inChar <= '9') {
                binaryStr += hexStrArr[inChar - '0'] + " ";
            } else if (inChar >= 'A' && inChar <= 'F') {
                binaryStr += hexStrArr[inChar - 'A' + 10] + " ";
            }
        }
        return binaryStr;
    }


    static void testHexadecimalToBinary() {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        System.out.print("Enter a hexadecimal string:");
        String inStr = sc.nextLine().toUpperCase();
        System.out.print("The binary value of the input \"" + inStr + "\" is :" + hexadecimalToBinary(inStr, HEX_BITS));
    }

    static void testDecimalToHexadecimal() {
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();
        System.out.println("The equivalent hexadecimal number is :" + decimalToHexadecimal(decimal));
    }

    static String decimalToHexadecimal(int decimal){
        final char[] HEXA_ARR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String result = "";
        while(decimal > 0){
            int remainder = decimal % 16;
            result = HEXA_ARR[remainder] + result;
            decimal = decimal / 16;
        }
        return result;
    }
}
