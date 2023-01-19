import java.util.Scanner;

public class USEP1stSemFinalExam {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int row, column, newRow, newColumn, split, sumOfLastElements = 0;
        int[][] matrix, reversedMatrix, splittedMatrix, finalMatrix;  //reversed matrix refers to the swapped dimensions of the array
        int[] oneDimensionArr;



        System.out.println("Enter the size of matrix: ");
        System.out.print("Row: ");
        row = scanf.nextInt();

        System.out.print("Column: ");
        column = scanf.nextInt();

        matrix = new int[column][row];

        System.out.print("Enter the elements: ");
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                matrix[i][j] = scanf.nextInt();
            }
        }

        System.out.printf("\nDisplaying the %dx%d\n", row,column);
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.println("Reversing the matrix......");

        newRow = column;
        newColumn = row;
        reversedMatrix = new int[newColumn][newRow];

        for(int i = 0, columnForReversed = 0, rowForReversed = 0; i < column; i++){
            for(int j = 0; j < row; j++, rowForReversed++){
                if(rowForReversed == newRow){
                    rowForReversed = 0;
                    columnForReversed++;
                }
                reversedMatrix[columnForReversed][rowForReversed] = matrix[i][j];
            }
        }

        System.out.printf("\nReversed size of matrix %dx%d\n", column,row);
        System.out.println("Displaying the matrix:");

        for(int i = 0; i < newColumn; i++){
            for(int j = 0; j < newRow; j++){
                System.out.print(reversedMatrix[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.println("\nIncrement each element by 1.....");

        for(int i = 0; i < newColumn; i++){
            for(int j = 0; j < newRow; j++){
                reversedMatrix[i][j]++;
            }
        }

        System.out.println("Displaying the matrix:");

        for(int i = 0; i < newColumn; i++){
            for(int j = 0; j < newRow; j++){
                System.out.print(reversedMatrix[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.println("\nConverting the matrix into 1x1......");

        oneDimensionArr = new int[newColumn * newRow];

        for(int i = 0, l = (row*column) - 1; i < newColumn; i++){
            for(int j = 0; j < newRow; j++, l--){
                oneDimensionArr[l] = reversedMatrix[i][j];
            }
        }

        System.out.println("Displaying the matrix in reversed form:");

        for(int i = 0 ; i < oneDimensionArr.length; i++) System.out.print(oneDimensionArr[i] + " ");



        System.out.print("\n\nEnter number of parts that the array will be splitted: ");
        split = scanf.nextInt();

        splittedMatrix = new int[(row*column)/split][split];

        for(int i = 0, j = 0; j < (row*column)/split; j++){
            for(int k = 0; k < split; k++, i++){
                splittedMatrix[j][k] = oneDimensionArr[i];
            }
        }

        for(int i = 0; i < split; i++){
            sumOfLastElements += splittedMatrix[((row*column)/split) - 1][i];
        }

        System.out.println("Sum of last elements: " + sumOfLastElements);

        finalMatrix = new int[((row*column)/split) - 1][split];

        for(int i = 0; i < ((row*column)/split) - 1; i++){
            for(int j = 0; j < split; j++){
                finalMatrix[i][j] = sumOfLastElements + splittedMatrix[i][j];
            }
        }

        System.out.println("Displaying the final array: ");

        for(int i = 0; i < finalMatrix.length; i++){
            for(int j = 0; j < split; j++){
                System.out.print(finalMatrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
