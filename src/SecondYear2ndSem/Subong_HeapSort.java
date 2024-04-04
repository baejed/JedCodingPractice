package SecondYear2ndSem;

import java.util.Scanner;

public class Subong_HeapSort {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("Enter array value [%d]: ", i);
            numArr[i] = scanf.nextInt();
        }

        System.out.print("\n\nInput array: ");
        printLineArray(numArr);
        System.out.println();

        buildMaxHeap(numArr, numArr.length);

        System.out.println("\nMax Heap");
        printLineArray(numArr);

        heapSort(numArr);
        System.out.println();

        System.out.print("Sorted array: ");
        printLineArray(numArr);

    }

    public static void printLineArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.print("]");
    }

    public static void heapify(int[] heap, int heapLength) {
        System.out.println("Heapify");

        int currentIndex = 0;

        while (currentIndex < heapLength) {
            int rightIndex = (currentIndex * 2) + 2;
            int leftIndex = (currentIndex * 2) + 1;
            int greaterValIndex;

            if (rightIndex == heapLength) {
                if (heap[currentIndex] < heap[leftIndex]){
                    swap(heap, currentIndex, leftIndex);
                    printArray(heap);
                    System.out.printf("Swapped index [%d] and index [%d]\n", currentIndex, leftIndex);
                }
                System.out.println("Heapify done");
                return;
            } else if (rightIndex > heapLength) {
                System.out.println("Heapify done");
                return;
            }

            greaterValIndex = (heap[leftIndex] >= heap[rightIndex]) ? leftIndex : rightIndex;

            if (heap[currentIndex] < heap[greaterValIndex]) {
                swap(heap, currentIndex, greaterValIndex);
                printArray(heap);
                System.out.printf("Swapped index [%d] and index [%d]\n", currentIndex, greaterValIndex);
                currentIndex = greaterValIndex;
            } else {
                System.out.println("Heapify done");
                return;
            }

        }

        System.out.println("Heapify done");

    }

    public static void heapSort(int[] arr) {
        System.out.println("\nHeap Sort Begins\n");
        int currentLength = arr.length;

        for (int i = 0; i < arr.length; i++) {
            swap(arr, 0, currentLength - 1);
            printArray(arr);
            System.out.printf("Swapped index first element and index [%d]\n",currentLength - 1);
//            System.out.println("current length" + currentLength);
            System.out.println();
            heapify(arr, --currentLength);
            System.out.println();
        }
    }

    public static void buildMaxHeap(int[] arr, int arrLength) {
        System.out.println("Build max heap");
        for (int i = 0; i < arrLength; i++) {

            int maxIndex = arrLength - 1;
            boolean hasSwapped = false;

            if (maxIndex % 2 == 1) {
                int parentIndex = (maxIndex / 2) - 1;

                if (arr[maxIndex] > arr[parentIndex]) {
                    swap(arr, maxIndex, parentIndex);
                    hasSwapped = true;
                    printArray(arr);
                    System.out.printf(" Swapped index [%d] and index [%d]\n", maxIndex, parentIndex);
                }

                maxIndex--;
            }

            for (int j = maxIndex; j > 1; j -= 2) {

                int parentIndex = (j / 2) - 1;
                int siblingIndex = j - 1;

                if (arr[j] < arr[siblingIndex]) {
                    swap(arr, j, siblingIndex);
                    hasSwapped = true;
                    printArray(arr);
                    System.out.printf(" Swapped index [%d] and index [%d]\n", j, siblingIndex);
                }

                if (arr[j] > arr[parentIndex]) {
                    swap(arr, j, parentIndex);
                    hasSwapped = true;
                    printArray(arr);
                    System.out.printf(" Swapped index [%d] and index [%d]\n", j, parentIndex);
                }

            }

            if (!hasSwapped) break;

        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
