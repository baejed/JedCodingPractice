public class Assignment7_1 {

    public static void main(String args[]){

        System.out.println(craps());

    }

    public static boolean craps(){

        int playerDice1, playerDice2;
        int comeOutRoll, point = -1;

        boolean winStatus = false;



        playerDice1 = (int)(Math.random()*6+1);
        playerDice2 = (int)(Math.random()*6+1);
        comeOutRoll = playerDice1 + playerDice2; //The two dice are initialized for the first come-out roll

        switch(comeOutRoll){
            case 7:
            case 11:
                winStatus = true; //This disables the program to proceed to the next loop and directly proceed to the "return true;" statement
                break;

            case 2:
            case 3:
            case 12:
                return false; //The player loses in this case

            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                point = comeOutRoll; //This case initializes the value of the point which the player need to aim to roll to win
                break;
        }

        while(point > 0 && !winStatus){

            playerDice1 = (int)(Math.random()*6+1);
            playerDice2 = (int)(Math.random()*6+1);
            comeOutRoll = playerDice1 + playerDice2; //The two dice are initialized for the new come-out roll until the point or a value of 7 is rolled

            if(comeOutRoll == point){
                winStatus = true; //This exits the loop and proceeds with the "return true;" statement
            }else if(comeOutRoll == 7){
                return false;
            }

        }

        return true;

    }

}
