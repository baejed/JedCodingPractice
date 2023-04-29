package CompetitiveProgramming;

import java.util.Scanner;

public class FrickinHeck {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int numOfJars;
        int swearCounter;
        int numOfTests;
        int[] jarContents;


        numOfTests = scanf.nextInt();

        for(int tests = 0; tests < numOfTests; tests++){
            numOfJars = scanf.nextInt();
            jarContents = new int[numOfJars];

            swearCounter = 0;

            for (int i = 0; i < numOfJars; i++) {
                jarContents[i] = scanf.nextInt();
            }

            for (int i = 0; i < jarContents.length - 2; i++) {
                if (jarContents[i] > 0 && jarContents[i + 1] > 0 && jarContents[i + 2] > 0) {
                    jarContents[i]--;
                    jarContents[i + 1]--;
                    jarContents[i + 2]--;
                    swearCounter++;
                }
            }

            for(int i = 0; i < jarContents.length; i++){
                if(jarContents[i] > 1){
                    jarContents[i] -= 2;
                    swearCounter++;
                }
            }

//            for(int i = 0; i < jarContents.length; i++){
//                System.out.print(jarContents[i] + " ");
//            }

            boolean clear = true;

            for(int i = 0; i < jarContents.length; i++){
                if(jarContents[i] > 0){
                    clear = false;
                    break;
                }
            }

            if(clear)
                System.out.println(swearCounter);
            else
                System.out.println("no");

        }

    }

}
