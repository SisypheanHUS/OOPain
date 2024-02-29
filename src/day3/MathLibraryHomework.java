package day3;

import java.util.Scanner;

public class MathLibraryHomework {

    public static void main(String[] args) {
        testTrigonometric();
        testSpecialSeries();
        factorial();
        factorialLong();
        fibonacciInt();
        tribonacciInt();
       testNumberConversion();
    }


    public static double sin(double x, int numTerms) {
        double result = 0;
        double power = 1;
        double fact = 1;
        double powerX = x;
        for (int i = 1; i <= numTerms; ++i) {
            result += powerX * power * fact;
            power *= -1;
            fact *= 1.0 / ((2 * i) * (2 * i + 1));
            powerX *= x * x;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0;
        double power = 1;
        double fact = 1;
        double powerX = 1;
        for (int i = 1; i <= numTerms; ++i) {
            result += powerX * power * fact;
            power *= -1;
            fact *= 1.0 / ((2 * i) * (2 * i - 1));
            powerX *= x * x;
        }
        return result;
    }

    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        double fact = 1;
        double powerX = x;
        for (int i = 1; i <= numTerms; ++i) {
            result += powerX * fact / (2 * i + 1);
            fact *= i * 1.0 / (i + 1);
            powerX *= x * x;
        }
        return result;
    }

    public static void testTrigonometric() {
        System.out.print("Enter the number of terms : ");
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        System.out.println("Math.sin(0) = " + Math.sin(0) + " and sin(0)," + terms + ") = " + sin(0, terms));
        System.out.println("Math.sin(PI/2) = " + Math.sin(Math.PI / 2) + " and sin(PI/2)," + terms + ") = " + sin(Math.PI / 2, terms));
        System.out.println("Math.cos(0) = " + Math.cos(0) + " and cos(0)," + terms + ") = " + cos(0, terms));
        System.out.println("Math.cos(PI/2) = " + Math.cos(Math.PI / 2) + " and cos(PI/2," + terms + ") = " + cos(Math.PI / 2, terms));
    }

    public static void testSpecialSeries() {
        System.out.print("Enter the number of terms : ");
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        System.out.println("SpecialSeries(0)," + terms + ") = " + specialSeries(0, terms));
        System.out.println("SpecialSeries(1)," + terms + ") = " + specialSeries(1, terms));
        System.out.println("SpecialSeries(2)," + terms + ") = " + specialSeries(2, terms));
    }

    public static void factorial() {
        int number = 1;
        long fact = 1;
        while (Integer.MAX_VALUE > fact) {
            System.out.println("Factorial of " + number + " is " + fact);
            number++;
            fact *= number;
        }
        System.out.println("Factorial of " + number + " is out of range");
    }

    public static void factorialLong() {
        int number = 1;
        long fact = 1;
        while (Long.MAX_VALUE / fact > (number + 1)) {
            System.out.println("Factorial of " + number + " is " + fact);
            number++;
            fact *= number;
        }
        System.out.println("Factorial of " + number + " is out of range");
    }

    public static void fibonacciInt() {
        int F1 = 1;
        int F2 = 1;
        int F3 = 0;
        int cnt = 2;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (Integer.MAX_VALUE - F1 > F2) {
            F3 = F1 + F2;
            System.out.println("F(" + cnt + ") = " + F3);
            ++cnt;
            F1 = F2;
            F2 = F3;
        }
        System.out.println("F(" + cnt + ") is out of range");
    }

    public static void tribonacciInt() {
        int F1 = 1;
        int F2 = 1;
        int F3 = 2;
        int F4 = 0;
        int cnt = 3;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");
        while (Integer.MAX_VALUE - F1 - F2 > F3) {
            F4 = F1 + F2 + F3;
            System.out.println("F(" + cnt + ") = " + F4);
            ++cnt;
            F1 = F2;
            F2 = F3;
            F3 = F4;
        }
        System.out.println("F(" + cnt + ") is out of range");
    }

    public static void testNumberConversion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String number = sc.nextLine();
        System.out.println("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.println("Enter the output radix: ");
        System.out.println("\"" + number + "\" in radix " + inRadix + " is \"" + toRadix(number, inRadix, sc.nextInt()) + "\" in radix " + inRadix + ".");

    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int decimal = 0;
        int powerRadix = 1;
        for (int idx = in.length() - 1; idx >= 0; --idx) {
            if (in.charAt(idx) >= 'A' && in.charAt(idx) <= 'Z') {
                decimal += (in.charAt(idx) - 'A' + 10) * powerRadix;
            } else {
                decimal += (in.charAt(idx) - '0') * powerRadix;
            }
            powerRadix *= inRadix;
        }
        String res = "";
        while (decimal > 0) {
            int digit = decimal % outRadix;
            if (digit >= 10) {
                res = (char) ('A' + digit - 10) + res;
            } else {
                res = (char) (digit + '0') + res;
            }
            decimal /= outRadix;
        }
        return res;
    }
}

