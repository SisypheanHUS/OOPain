package day3;

import java.util.Scanner;

public class ArrayHomework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printArrayStars(sc);
    }

    static void printArrayStars() {
    }

    static void printArrayStars(Scanner in) {
        System.out.print("Enter the number of items : ");
        final int NUM_ITEMS = in.nextInt();
        System.out.print("Enter the value of all items(separated by space) : ");
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; ++i) {
            items[i] = in.nextInt();
        }
        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + " : ");
            for (int starNo = 0; starNo < items[idx]; ++starNo) {
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
    }
}
