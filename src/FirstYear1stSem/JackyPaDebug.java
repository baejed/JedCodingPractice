import java.util.Scanner;

public class JackyPaDebug {

    public static void main(String [] args){
        Scanner jam = new Scanner(System.in);
        int row = 0;
        int column = 0;

        //row and column
        System.out.println("Enter size of matrix:");
        System.out.print("Row: ");
        row = jam.nextInt();
        System.out.print("Column: ");
        column = jam.nextInt();

        //input elements
        int [][] matrix = new int[row][column];
        System.out.println("Enter the elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix [i][j] = jam.nextInt();
            }
        }

        //display matrix na wala naka reverse
        System.out.println("\nDisplaying the " + row + "x" + column + " matrix:");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //matrix na naka reverse
        System.out.println("\nReversing the matrix.......");
        System.out.println("\nReversing the matrix: " + column + "x" + row);
        System.out.println("Displaying the matrix: ");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        //increment matrix
        System.out.println("\nIncrement each element by 1........");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[j][i] + 1 + " ");
            }
            System.out.println();
        }

        //i one by one ang matrix
        System.out.println("\nConverting the matrix to 1x1.......");
        System.out.println("Displaying the matrix in reversed form.....");
        int [] onebyone = new int[row*column];
        int reverse = 0;
        for(int i=row-1; i>-1; i--){
            for(int j=column-1; j>-1; j--){
                onebyone[reverse++] = matrix[i][j] + 1;
            }
        }

        for(int i=0; i<onebyone.length; i++){
            System.out.print(onebyone[i] + " ");
        }
        System.out.println();

        //split ang array wheuwheu
        System.out.print("\nEnter the # of parts in which array is to be splitted: ");
        int split = jam.nextInt();

        int sizeA = row*column;
        int [] matrixC = new int [split];
        int [] matrixD = new int[sizeA - split];
        int sizeB = sizeA - split;
        for(int i=0; i<split; i++){
            matrixC[i] = onebyone[sizeB++];
        }
        for(int j=0; j<onebyone.length - split; j++){
            matrixD [j] = onebyone[j];
        }

        //sum sa last elements
        int total = 0;
        for(int i = 0; i<matrixC.length; i++){
            total += matrixC[i];
        }
        for(int i=0; i<matrixD.length; i++){
            matrixD [i] += total;
        }
        System.out.println("The sum of the last elements: " + total);
        System.out.println();

        //display final array, naka reverse, incremented and added ang sum sa last elements

        System.out.println("Displaying the final array: ");
        int [][] matrixF = new int[split][split];
        int k=0;
        for(int i=0; i<split; i++){
            for(int j=0; j<split; j++){
                matrixF[i][j] = matrixD[k++];
            }
        }
        for(int i=0; i<split; i++){
            for(int j=0; j<split; j++){
                System.out.print(matrixF[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMerry Christmas Ma'am!\n");
    }

}
