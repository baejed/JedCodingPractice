package FirstYear2ndSem;

import java.util.Scanner;

public class AsynchronousActivity2_2 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] inputtedIntegers = new int[1000];
        int inputCounter = 0;

        System.out.print("Enter integers between 1 and 100: ");
        do{
            inputtedIntegers[inputCounter] = scanf.nextInt();
            inputCounter++;
        }while(inputtedIntegers[inputCounter - 1] != 0);

        displayOccurrences(inputtedIntegers, inputCounter);

    }

    public static void displayOccurrences(int[] integerArray, int numOfInputs){

        int[] occurrence = new int[101];

        for(int i = 0; i < numOfInputs; i++){
            occurrence[integerArray[i]]++;
        }

        for(int i = 1; i < occurrence.length; i++){

            if(occurrence[i] == 0) continue;

            if(occurrence[i] == 1){
                System.out.printf("%d occurs %d time\n", i, occurrence[i]);
                continue;
            }

            System.out.printf("%d occurs %d times\n", i, occurrence[i]);

        }

    }

}
