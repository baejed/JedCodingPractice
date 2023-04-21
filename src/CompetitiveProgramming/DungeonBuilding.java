package CompetitiveProgramming;

import java.util.Scanner;

public class DungeonBuilding {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int dimension;
        int[][] contents;
        char[][] map;


        dimension = scanf.nextInt();
        contents = new int[dimension][dimension];
        map = new char[dimension * 3][dimension * 3];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                contents[i][j] = scanf.nextInt();
            }
        }

        for (int i = 0; i < contents.length; i++) {
            for (int j = 0; j < contents[i].length; j++) {
                if (contents[i][j] == 1) {
                    for (int k = (i * 3); k < (i * 3) + 3; k++) {
                        for (int l = (j * 3); l < (j * 3) + 3; l++) {
                            map[k][l] = '#';
                        }
                    }
                } else {
                    for (int k = (i * 3); k < (i * 3) + 3; k++) {
                        for (int l = (j * 3); l < (j * 3) + 3; l++) {
                            if (k == (i * 3) + 1 && l == (j * 3) + 1) {
                                map[k][l] = ' ';
                                continue;
                            }
                            map[k][l] = '#';
                        }
                    }
                }
            }
        }

        connectAdjacent(map);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }

    public static void connectAdjacent(char[][] roomMap) {
        int sideLength = (roomMap.length / 3);

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                try {
                    if (roomMap[(i * 3) + 1][(j * 3) + 1] == ' ' && roomMap[(i * 3) + 1][(j * 3) + 4] == ' ') {
                        roomMap[(i * 3) + 1][(j * 3) + 2] = ' ';
                        roomMap[(i * 3) + 1][(j * 3) + 3] = ' ';
                    }

                    if (roomMap[(j * 3) + 1][(i * 3) + 1] == ' ' && roomMap[(j * 3) + 4][(i * 3) + 1] == ' ') {
                        roomMap[(j * 3) + 2][(i * 3) + 1] = ' ';
                        roomMap[(j * 3) + 3][(i * 3) + 1] = ' ';
                    }
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            }
        }
    }

}