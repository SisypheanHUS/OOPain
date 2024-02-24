package day2;

import java.util.Arrays;
import java.util.Scanner;

public class MethodExercise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        testExponent();
//        testMagicSum(sc);
//        testPrint();
//        testArrayToString();
//        testContains();
//        testSearch();
//        testEquals();
//        testCopyOf();
        testCopyOf1();
//        testSwap();
//        testReverse();
    }

    static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    static void testExponent() {
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        System.out.print(+base + " raises to the power of" + exp + " is : " + exponent(base, exp));
    }


    static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    static void testMagicSum(Scanner in) {
        int sum = 0;
        final int SENTINEL = -1;
        int number;
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();
        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.print("The magic sum is: " + sum);
    }

    static void print(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",");
        }
        if (arr.length > 0) {
            str.append(arr[arr.length - 1]);
        }
        str.append("]");
        System.out.println(str);
    }

    static void print(float[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",");
        }
        if (arr.length > 0) {
            str.append(arr[arr.length - 1]);
        }
        str.append("]");
        System.out.println(str);
    }

    static void print(double[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",");
        }
        if (arr.length > 0) {
            str.append(arr[arr.length - 1]);
        }
        str.append("]");
        System.out.println(str);
    }

    static void testPrint() {
        int[] arr = {1, 2, 3, 4, 5};
        float[] arr1 = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] arr3 = {};
        print(arr3);
        print(arr);
        print(arr1);
        print(arr2);
    }

    static String arrayToString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    static void testArrayToString() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrayToString(arr));
    }

    static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    static void testContains() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(contains(arr, 3));
        System.out.println(contains(arr, 6));
    }

    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void testSearch() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(search(arr, 3));
        System.out.println(search(arr, 6));
    }

    static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static void testEquals() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};
        System.out.println(equals(arr1, arr2));
        System.out.println(equals(arr1, arr3));
    }

    static int[] copyOf(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    static int[] copyOf(int[] arr, int newLength) {
        int[] result = new int[newLength];
        for (int i = 0; i < newLength && i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    static void testCopyOf1() {
        int[] arr = {1, 2, 3, 4, 5};
        int newLength = 10;
        System.out.println(Arrays.toString(copyOf(arr, newLength)));
    }


        static void testCopyOf () {
            int[] arr = {1, 2, 3, 4, 5};
            int[] arr1 = copyOf(arr);
            arr1[0] = 0;
            System.out.println(arr[0]);
        }

        static boolean swap ( int[] array1, int[] array2){
            if (array1.length != array2.length) {
                return false;
            }
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }

        static void testSwap () {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {6, 7, 8, 9, 10};
            swap(arr1, arr2);
            print(arr1);
            print(arr2);
        }

        static int[] reverse ( int[] arr){
            int[] result = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[arr.length - 1 - i];
            }
            return result;
        }

        static void testReverse () {
            int[] arr = {1, 2, 3, 4, 5};
            print(reverse(arr));
        }
    }
