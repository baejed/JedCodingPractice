package FirstYear2ndSem;

import java.util.Scanner;

public class AsynchronousActivity1_2 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int[] inputScores = new int[1000];
        int[] scoreRanges = new int[8]; //This variable stores the eight score ranges in increasing order
        String[] scoreRangesValues = {"0-24", "25-49", "50-74", "75-99", "100-124", "125-149", "150-174", "175-200"};
        int counter = 0;

        System.out.println("(In order to stop the program from taking inputs, input any character that isn't a number)");
        System.out.println("(You can either input the list of scores or input the scores one by one)");
        System.out.print("Input the scores of the students: ");

        while (scanf.hasNextInt()) {
            inputScores[counter] = scanf.nextInt();
            counter++;
        }

        for (int i = 0; i < counter; i++) {

            if (inputScores[i] <= 24) {
                scoreRanges[0]++;
                continue;
            }

            if (inputScores[i] <= 49) {
                scoreRanges[1]++;
                continue;
            }

            if (inputScores[i] <= 74) {
                scoreRanges[2]++;
                continue;
            }

            if (inputScores[i] <= 99) {
                scoreRanges[3]++;
                continue;
            }

            if (inputScores[i] <= 124) {
                scoreRanges[4]++;
                continue;
            }

            if (inputScores[i] <= 149) {
                scoreRanges[5]++;
                continue;
            }

            if (inputScores[i] <= 174) {
                scoreRanges[6]++;
                continue;
            }

            if (inputScores[i] <= 200) {
                scoreRanges[7]++;
            }

        }

        System.out.println();

        for (int i = 0; i < scoreRanges.length; i++) {

            System.out.printf("Number of students who got %s: %d\n", scoreRangesValues[i], scoreRanges[i]);

        }

    }


}
