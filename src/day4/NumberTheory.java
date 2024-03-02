package day4;

import java.util.Scanner;

public class NumberTheory {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testPerfectNumberList();
        testPrimeList();
        testPerfectPrimeFactorList();
        gcd();
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum < n;
    }

    public static void PerfectNumberList(int bound) {
        System.out.println("These number are perfect : ");
        int countPerfect = 0;
        for (int i = 1; i <= bound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect++;
            }

        }
        System.out.println();
        System.out.println("[" + countPerfect + " perfect number found" + "(" + countPerfect / (bound * 100) + "%)]");
        System.out.println("These number are deficient nor perfect : ");
        int countDeficient = 0;
        for (int i = 1; i <= bound; i++) {
            if (!isDeficient(i) && !(isPerfect(i))) {
                countDeficient++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(countDeficient + " deficient number found" + "(" + countDeficient / (bound * 100) + "%)");
    }

    public static void testPerfectNumberList() {
        System.out.print("Enter the upper bound : ");
        int bound = sc.nextInt();
        PerfectNumberList(bound);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void primeList(int bound) {
        int countPrime = 0;
        for (int i = 1; i <= bound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                countPrime++;
            }
        }
        System.out.printf("There are %d prime numbers found (%.2f%%)\n", countPrime, (double) countPrime / bound * 100);

    }

    public static void testPrimeList() {
        System.out.print("Enter the upper bound : ");
        int bound = sc.nextInt();
        primeList(bound);
    }


    public  static boolean isProfuctOfPrimeFactorr(int aPosInt){
        int n = aPosInt;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    n /= i;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void PerfectPrimeFactorList(int bound) {
        int countPerfectPrimeFactor = 0;
        for (int i = 1; i <= bound; i++) {
            if (isProfuctOfPrimeFactorr(i)) {
                System.out.println(i);
                countPerfectPrimeFactor++;
            }
        }
        System.out.printf("There are %d numbers which are product of prime factors found (%.2f%%)\n", countPerfectPrimeFactor, (double) countPerfectPrimeFactor / bound * 100);
    }

    public static void testPerfectPrimeFactorList() {
        System.out.print("Enter the upper bound : ");
        int bound = sc.nextInt();
        PerfectPrimeFactorList(bound);
    }

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void gcd(){
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

}
