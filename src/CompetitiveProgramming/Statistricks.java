package CompetitiveProgramming;

import java.util.Scanner;

public class Statistricks {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] initialValues = new int[6];
        int minInitialValue;
        double finalValue;
        int numOfInputs;
        int percentage;


        numOfInputs = scanf.nextInt();

        for(int i = 0; i < numOfInputs; i++){
            minInitialValue = Integer.MAX_VALUE;
            for(int j = 0; j < initialValues.length; j++){
                initialValues[i] = scanf.nextInt();
                minInitialValue = Math.min(initialValues[i], minInitialValue);
            }
            finalValue = scanf.nextInt();

            percentage = (int)(Math.ceil(((finalValue - minInitialValue)/minInitialValue) * 100));

            if(percentage > 0)
                System.out.printf("%d%% INCREASE!\n", percentage);
            else
                System.out.println("DATA IS BIAS!");
        }

    }

}
