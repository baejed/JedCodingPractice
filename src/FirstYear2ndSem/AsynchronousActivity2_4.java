package FirstYear2ndSem;

import java.util.Scanner;

public class AsynchronousActivity2_4 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] firstArr, secondArr;
        int firstArrLength, secondArrLength;



        System.out.print("Enter list1: ");
        firstArrLength = scanf.nextInt();
        firstArr = new int[firstArrLength];
        for(int i = 0; i < firstArr.length; i++){
            firstArr[i] = scanf.nextInt();
        }

        System.out.print("Enter list2: ");
        secondArrLength = scanf.nextInt();
        secondArr = new int[secondArrLength];
        for(int i = 0; i < secondArr.length; i++){
            secondArr[i] = scanf.nextInt();
        }

        if(equal(firstArr, secondArr)) System.out.println("Two lists are identical");
        else System.out.println("Two lists are not identical");

    }

    public static boolean equal(int[] list1, int[] list2){

        if(list1.length != list2.length) return false;

        sortArrValues(list1);
        sortArrValues(list2);

        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]) return false;
        }

        return true;

    }

    public static void sortArrValues(int[] arr){

        boolean errorPresent;

        do{
            errorPresent = false;

            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    errorPresent = true;
                }
            }

        }while(errorPresent);

    }

}
