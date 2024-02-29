package day3;

import java.util.Scanner;

public class NestedLoopsExercise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SquarePattern();
        CheckerPattern();
        TimeTable();
        TriangularPattern();
        BoxPattern();
        hillPattern();
    }


    // 1. Write a program to print the following pattern:

    static void SquarePattern() {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        SquarePattern(size);
    }

    static void SquarePattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 2. Write a program to print the following pattern:

    static void CheckerPattern() {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        CheckerPattern(size);
    }

    static void CheckerPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 3. Write a program to print the multiplication table of a given number. The program shall ask the user to enter the size of the table. The program shall display the multiplication table of the given size.
    static void TimeTable() {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        TimeTable(size);
    }

    static void TimeTable(int size) {
        System.out.print("∗ |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-------------------------------------------");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    // 4. Write a program to print the following pattern:
    static void TriangularPattern() {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        TriangularPattern(size);
    }

    static void TriangularPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i >= j) ? "#" : " ");
            }
            System.out.print("   "); // space between patterns

            for (int j = 1; j <= size; j++) {
                System.out.print((i + j <= size + 1) ? "#" : " ");
            }
            System.out.print("   "); // space between patterns

            for (int j = 1; j <= size; j++) {
                System.out.print((j >= i) ? "#" : " ");
            }
            System.out.print("   "); // space between patterns

            for (int j = 1; j <= size; j++) {
                System.out.print((i + j >= size + 1) ? "#" : " ");
            }
            System.out.println();
        }
    }
    // 5. Write a program to print the following pattern:

    static void BoxPattern() {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        boxPattern(size);
    }

    static void boxPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i == 1 || i == size || j == 1 || j == size) ? "#" : " ");
            }
            System.out.print("   "); // space between patterns

            for (int j = 1; j <= size; j++) {
                System.out.print((i == 1 || i == size || i == j) ? "#" : " ");
            }
            System.out.print("   "); // space between patterns

            for (int j = 1; j <= size; j++) {
                System.out.print((i == 1 || i == size || i + j == size + 1) ? "#" : " ");
            }
            System.out.print("   "); // space between patterns

            for (int j = 1; j <= size; j++) {
                System.out.print((i == 1 || i == size || i == j || i + j == size + 1) ? "#" : " ");
            }

            System.out.println();
        }
    }

    // 6. Write a program to print the following pattern:
    static void hillPattern() {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        HillPatternA(size);
        HillPatternB(size);
        HillPatternC(size);
        HillPatternD(size);
    }

    public static void HillPatternA(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = row * 2 + 1;
                int indexStart = size - row - 1;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void HillPatternB(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = size * 2 - 1 - row * 2;
                int indexStart = row;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void HillPatternC(int size) {
        for (int row = 0; row < size * 2 - 1; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                if (row <= size-1) {
                    int numberCharsNotEmpty = row * 2 + 1;
                    int indexStart = size - row - 1;
                    int indexEnd = indexStart + numberCharsNotEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
                } else {
                    int numberCharsNotEmpty = size * 2 - 1 - (row - size + 1) * 2;
                    int indexStart = row - size + 1;
                    int indexEnd = indexStart + numberCharsNotEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternD(int size) {
        for (int row = 0; row < size * 2 - 1; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                if (row == 0 || row == size * 2 - 2) {
                    System.out.print("# ");
                } else if (row <= size-1) {
                    int numberCharsEmpty = row * 2 - 1;
                    int indexStart = size - row;
                    int indexEnd = indexStart + numberCharsEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "  " : "# ");
                } else {
                    int numberCharsEmpty = 2 * size - 1 - (row - size + 2) * 2;
                    int indexStart = row - size + 2;
                    int indexEnd = indexStart + numberCharsEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "  " : "# ");
                }
            }
            System.out.println();
        }
    }



}