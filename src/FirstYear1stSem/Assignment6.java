import java.util.Random;

public class Assignment6 {

    public static void main(String args[]){

        Random rng = new Random();

        int playerDice1, playerDice2;
        int comeOutRoll, point = -1;

        boolean winStatus = false;

        do{

            playerDice1 = rng.nextInt(6) + 1;
            playerDice2 = rng.nextInt(6) + 1;
            comeOutRoll = playerDice1 + playerDice2;

            System.out.println("\nDice 1: " + playerDice1);
            System.out.println("Dice 2: " + playerDice2);
            System.out.println("Come-out roll: " + comeOutRoll);

            if(point > 0){

                System.out.println("Point: " + point);

                if(comeOutRoll == point){
                    System.out.println("You win");
                    winStatus = true;
                }else if(comeOutRoll == 7){
                    System.out.println("\nYou lose");
                    System.out.println("\nNew round");
                    System.out.println("--------------------------");
                    point = 0;
                }else{
                    System.out.println("Continue rolling");
                }

                continue;

            }

            switch(comeOutRoll){
                case 7:
                case 11:
                    System.out.println("\nYou win");
                    winStatus = true;
                    break;

                case 2:
                case 3:
                case 12:
                    System.out.println("\nYou lose");
                    System.out.println("\nNew round");
                    System.out.println("--------------------------");
                    break;

                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                    point = comeOutRoll;
                    System.out.println("Point: " + point);
                    System.out.println("Continue rolling");
            }

        }while(!winStatus);

    }

}
