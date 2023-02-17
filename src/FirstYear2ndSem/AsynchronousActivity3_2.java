package FirstYear2ndSem;

import java.util.Random;

public class AsynchronousActivity3_2 {

    public static void main(String[] args) {

        int[] possibleSums = new int[13];
        int[][] pairOfDice = new int[1000][3];
        int maxSumRolled = 0, maxSumRolledIndex = 0;


        rollDice(pairOfDice, possibleSums);

        System.out.println();

        displaySumFrequency(possibleSums);

        for (int i = 1; i < possibleSums.length; i++) {
            if (possibleSums[i] > maxSumRolled) {
                maxSumRolled = possibleSums[i];
                maxSumRolledIndex = i;
            }
        }

        System.out.printf("The sum of %d has been rolled the most, with a frequency of %d", maxSumRolledIndex, maxSumRolled);

    }

    public static void rollDice(int[][] pairOfDice, int[] possibleSums) {

        Random diceRoller = new Random();

        for (int i = 0; i < pairOfDice.length; i++) {
            pairOfDice[i][0] = diceRoller.nextInt(6) + 1;
            pairOfDice[i][1] = diceRoller.nextInt(6) + 1;
            pairOfDice[i][2] = pairOfDice[i][0] + pairOfDice[i][1]; //The sum of the pair of dice
            possibleSums[pairOfDice[i][2]]++;
            System.out.printf("%d. Die 1: %d, Die 2: %d, Sum: %d\n", i+1, pairOfDice[i][0], pairOfDice[i][1], pairOfDice[i][2]);
        }

    }

    public static void displaySumFrequency(int[] possibleSums){

        for (int i = 2; i < possibleSums.length; i++) {
            System.out.printf("The sum of %d was rolled %d time\\s\n", i, possibleSums[i]);
        }

    }

}
