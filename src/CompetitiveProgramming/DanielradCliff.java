package CompetitiveProgramming;

import java.util.Scanner;

public class DanielradCliff {

    public static void main(String[] args) {

        //incomplete

        Scanner scanf = new Scanner(System.in);
        int[][] plantCoordinates;
        int[][] postCoordinates = new int[3][2];
        int numOfPlants;
        int highestY = 0, highestX = 0;

        numOfPlants = scanf.nextInt();
        plantCoordinates = new int[7][2];

        for(int i = 0; i < numOfPlants; i++){
            plantCoordinates[i][0] = scanf.nextInt();
            plantCoordinates[i][1] = scanf.nextInt();
        }

        for(int i = 0; i < numOfPlants; i++){
            highestX = Math.max(highestX, plantCoordinates[i][0]);
            highestY = Math.max(highestY, plantCoordinates[i][1]);
        }

        System.out.printf("Highest x: %d \nHighest y: %d", highestX, highestY);

    }

}
