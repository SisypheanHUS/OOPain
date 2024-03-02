package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseOnAlgorithm {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testlinearSearch();
        testBinarySearch();
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
    }


    public static boolean linearSearch(int[] array, int key) {
        for (int num : array) {
            if (num == key) return true;
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return 0;
    }

    public static void testlinearSearch() {
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        sc.close();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The answer is : its " + linearSearch(array, key));
        System.out.println("The index of " + key + " is : " + linearSearchIndex(array, key));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) return true;
            else return false;
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) return true;
            else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else fromIdx = middleIdx + 1;
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    static boolean binarySearch(int[] array, int key) {
        int fromIdx = 0;
        int toIdx = array.length - 1;
        sc.close();
        return binarySearch(array, key, fromIdx, toIdx);
    }

    static void testBinarySearch() {
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        sc.close();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, key));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                int temp = array[i];
                if (array[i - 1] > array[i]) {
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        }
        while (swapped);
    }

    public static void testBubbleSort() {
        int[] array = {1, 4, 5, 6, 3, 2, 6, 7, 8, 6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx]) min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }


    public static void testSelectionSort() {
        int[] array = {1, 2, 4, 3, 5, 6, 7, 8, 5, 4, 3, 2, 6, 7};
        selectionSort(array);
        System.out.println("Sorted Array is : " + Arrays.toString(array));
    }


    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void testInsertionSort() {
        int[] array = {9, 6, 4, 1, 5, 2, 7};
        insertionSort(array);
        System.out.println("Sorted Array is : " + Arrays.toString(array));
    }
}
