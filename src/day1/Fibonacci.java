
package day1;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printOut(number);
    }

    public static void printOut(int number) {
        int[] Fibonnacci = new int[number];
        Fibonnacci[0] = 1;
        Fibonnacci[1] = 1;
        double sum = 2.0;
        System.out.priant("The first 20 Fibonacci number are :");
        for (int i = 2; i < number; i++) {
            Fibonnacci[i] = Fibonnacci[i - 1] + Fibonnacci[i - 2];
            System.out.print(+Fibonnacci[i] + " ");
            sum += Fibonnacci[i];
        }
        System.out.println();
        double average = sum / number;
        System.out.println("The average is " + average);
    }
}