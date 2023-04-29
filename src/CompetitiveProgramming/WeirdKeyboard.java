package CompetitiveProgramming;

import java.util.Scanner;

public class WeirdKeyboard {

    public static void main(String[] args) {

        //incomplete

        Scanner scanf = new Scanner(System.in);
        String[] keys;
        String goalText;
        String typedText;
        int numOfTests;
        int numOfKeys;


        numOfTests = scanf.nextInt();
        numOfKeys = scanf.nextInt();

        keys = new String[numOfKeys];

        for(int i = 0; i < numOfKeys; i++){
            keys[i] = scanf.next();
        }

        goalText = scanf.nextLine();



    }

}
