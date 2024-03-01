package day4;

import java.util.Scanner;

public class ExcerciseOnRecursion {

    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        factorial();
        fibonacci();
        numOfDigits();
        gcd();
    }

    // 1. Write a program to find the factorial of a number using recursion.

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void factorial(){
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    // 2. Write a program to find the fibonacci of a number using recursion.
    static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void fibonacci(){
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }

    // 3. Write a program to find the number of digits in a number using recursion.

    static int numOfDigits(int n){
        if(n < 10){
            return 1;
        }
        return 1 + numOfDigits(n / 10);
    }

    static void numOfDigits(){
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Number of digits in " + n + " is " + numOfDigits(n));
    }

    // 4. Write a program to find the GCD of two numbers using recursion.

    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    static void gcd(){
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
