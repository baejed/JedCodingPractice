package FirstYear2ndSem;

import java.util.Scanner;

public class AsynchronousActivity2_3 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] tenNums = new int[10], distinctNumbers;



        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < tenNums.length; i++){
            tenNums[i] = scanf.nextInt();
        }

        distinctNumbers = distinctNums(tenNums);

        System.out.print("The distinct numbers are: ");
        for(int i : distinctNumbers){
            System.out.printf("%d ", i);
        }

    }

    public static int[] distinctNums(int[] tenNumbers){

        int[] initialDistinctNumbers = new int[10], finalDistinctNumbers;
        int numOfDistinctNums = 1;

        initialDistinctNumbers[0] = tenNumbers[0];

        for(int i = 1, j = 1; j < tenNumbers.length; j++){
            for(int k = i - 1; k >= 0; k--){
                if(tenNumbers[j] == initialDistinctNumbers[k]) break;
                if(k == 0){
                    initialDistinctNumbers[i] = tenNumbers[j];
                    numOfDistinctNums++;
                    i++;
                }
            }
        }

        finalDistinctNumbers = new int[numOfDistinctNums];

        for(int i = 0; i < numOfDistinctNums; i++){
            finalDistinctNumbers[i] = initialDistinctNumbers[i];
        }

        return finalDistinctNumbers;

    }

}
