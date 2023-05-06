package CompetitiveProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PotFitting {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        List<Integer> potDiameters = new ArrayList<>();
        int numOfPots;
        int currentPot;
        int stackCounter = 0;


        numOfPots = scanf.nextInt();

        for(int i = 0; i < numOfPots; i++){
            potDiameters.add(scanf.nextInt());
        }

        Collections.sort(potDiameters);

        while(!potDiameters.isEmpty()){

            currentPot = potDiameters.get(0);
            potDiameters.remove(0);

            for(int i = 0; i < potDiameters.size();){
                if(currentPot < potDiameters.get(i)){
                    currentPot = potDiameters.get(i);
                    potDiameters.remove(i);
                }else{
                    i++;
                }
            }

            stackCounter++;

        }

        if(stackCounter == 0)
            System.out.println(1);
        else
            System.out.println(stackCounter);

    }

}
