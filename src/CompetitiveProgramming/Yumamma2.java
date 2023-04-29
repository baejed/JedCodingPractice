package CompetitiveProgramming;

import java.util.Scanner;

public class Yumamma2 {

    public static void main(String[] args) {

        //incomplete

        Scanner scanf = new Scanner(System.in);
        char[][] map;
        int rows, columns;
        String stringLine;


        rows = scanf.nextInt();
        columns = scanf.nextInt();
        stringLine = scanf.nextLine();

        map = new char[rows][columns];

        for(int i = 0; i < rows; i++){
            stringLine = scanf.nextLine();
            for(int j = 0; j < columns; j++){
                map[i][j] = stringLine.charAt(j);
            }
        }



    }

}
