import java.util.Scanner;

public class FinalLabExam2ndTerm1stSem {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int numOfTerms, finalCount = 0, repetition = 1, initialCount;


        System.out.print("Enter  number of terms: ");
        numOfTerms = scanf.nextInt();

        System.out.println("");

        for (initialCount = -1; finalCount != initialCount; repetition++) {

            initialCount = finalCount;

            for (int i = 0; finalCount < numOfTerms && i < repetition; i++, finalCount++) {

                //System.out.print(finalCount); //un-comment the print statement to test the number of outputs
                System.out.println("PAK");      //note that the counter starts at 0

            }

            for (int j = 0; finalCount < numOfTerms && j < repetition; j++, finalCount++) {

                //System.out.print(finalCount); //un-comment the print statement to test the number of outputs
                System.out.println("GANERN");   //note that the counter starts at 0

            }

        }
    }
}
