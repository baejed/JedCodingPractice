package CompetitiveProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblematicPublicKeys {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        List<Integer> primeFactors = new ArrayList<>();
        int currentInput;
        int potentialFactor;
        int numOfInputs;


        numOfInputs = scanf.nextInt();

        for (int i = 0; i < numOfInputs; i++) {
            currentInput = scanf.nextInt();
            potentialFactor = 2;

            while (true) {
                if (currentInput % potentialFactor == 0) {
                    if (!primeFactors.contains(potentialFactor))
                        primeFactors.add(potentialFactor);

                    if (!primeFactors.contains(currentInput / potentialFactor))
                        primeFactors.add(currentInput / potentialFactor);

                    break;
                }

                potentialFactor = increaseToNextPrime(potentialFactor);
            }
        }

        Collections.sort(primeFactors);

        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.print(primeFactors.get(i) + " ");

            if ((i + 1) % 5 == 0)
                System.out.println();
        }

    }

    public static int increaseToNextPrime(int currentPrime) {
        int potentialFactor;

        while (true) {
            currentPrime++;
            potentialFactor = currentPrime - 1;
            while (true) {
                if (currentPrime % potentialFactor == 0)
                    break;

                if (potentialFactor == 2)
                    return currentPrime;

                potentialFactor--;
            }
        }
    }

}
