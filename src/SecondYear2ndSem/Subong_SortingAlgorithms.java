package SecondYear2ndSem;

import java.util.Arrays;
import java.util.Scanner;

public class Subong_SortingAlgorithms {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] arr;
        boolean repeat;


        System.out.print("Enter size of the array: ");
        arr = new int[scanf.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element for array index " + i + ": ");
            arr[i] = scanf.nextInt();
        }

        do {

            repeat = false;

            System.out.println("\n[B] Bubble sort");
            System.out.println("[M] Merge sort");
            System.out.println("[I] Insertion sort");
            System.out.println("[S] Selection sort");
            System.out.println("[Q] Quick sort");
            System.out.print("Select a sorting algorithm: ");

            char input = scanf.next().toUpperCase().charAt(0);
            System.out.println();

            switch (input) {
                case 'B':
                    bubbleSort(arr);
                    System.out.println("Array sorted");
                    break;
                case 'I':
                    insertionSort(arr);
                    System.out.println("Array sorted");
                    break;
                case 'S':
                    selectionSort(arr);
                    System.out.println("Array sorted");
                    break;
                case 'Q':
                    printArray(arr);
                    quickSort(arr, 0, arr.length - 1);
                    System.out.println("Array sorted");
                    break;
                case 'M':
                    System.out.print("Input array: ");
                    printArray(arr);
                    mergeSort(arr);
                    System.out.println("Array sorted");
                    break;
                default:
                    System.out.println("Invalid input");
                    repeat = true;

            }
        } while (repeat);

    }

    static void selectionSort(int[] arr) {

        int n = arr.length;

        printArray(arr);

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    static void bubbleSort(int[] arr) {
        int i, j, temp;
        int length = arr.length;
        boolean swapped;

        printArray(arr);

        for (i = 0; i < length - 1; i++) {
            swapped = false;
            for (j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                printArray(arr);
            }

            if (!swapped)
                break;
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        printArray(arr);

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                printArray(arr, key);
            }
            arr[j + 1] = key;
            printArray(arr, key);
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        System.out.println(Arrays.toString(arr)); // Log the array at each step
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);


        // Recursively sort the left and right halves
        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);

        int i = 0, j = 0, k = 0;

        // Merge the two sorted halves
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] < rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from leftHalf
        while (i < leftHalf.length) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightHalf
        while (j < rightHalf.length) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }

        System.out.println("Left array: " + arrayToString(leftHalf));
        System.out.println("Right array: " + arrayToString(rightHalf));
        System.out.println("Merges array: " + arrayToString(arr));
        System.out.println();

        return arr;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    static void printArray(int[] arr) {
        System.out.println(arrayToString(arr));
    }

    static void printArray(int[] arr, int temp) {
        System.out.print(arrayToString(arr));
        System.out.println("  Temp:" + temp);
    }

}
