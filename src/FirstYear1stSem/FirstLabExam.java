package FirstYear1stSem;

import java.util.Random;

public class FirstLabExam {

    public static void main(String[] args) {

        Random rng = new Random();

        String yourSuit = "blank";
        String computerSuit = "blank";

        int computerHand, yourHand;
        char[] suits = {'s','h', 'd', 'c'};



        switch(suits[(rng.nextInt(4))]){
            case 's':
                yourSuit = "spades";
                break;
            case 'h':
                yourSuit = "hearts";
                break;
            case 'd':
                yourSuit = "diamonds";
                break;
            case 'c':
                yourSuit = "clubs";
                break;
        }

        switch(suits[(rng.nextInt(4))]){
            case 's':
                computerSuit = "spades";
                break;
            case 'h':
                computerSuit = "hearts";
                break;
            case 'd':
                computerSuit = "diamonds";
                break;
            case 'c':
                computerSuit = "clubs";
                break;
        }

        yourHand = rng.nextInt(13) + 1;
        computerHand = rng.nextInt(13) + 1;

        System.out.println("Dealing cards...");

        switch(yourHand){
            case 1:
                System.out.printf("\nYou got Ace of %s", yourSuit);
                break;
            case 11:
                System.out.printf("\nYou got Jack of %s", yourSuit);
                break;
            case 12:
                System.out.printf("\nYou got Queen of %s", yourSuit);
                break;
            case 13:
                System.out.printf("\nYou got King of %s", yourSuit);
                break;
            default:
                System.out.printf("\nYou got %d of %s", yourHand, yourSuit);
                break;
        }

        switch(computerHand){
            case 1:
                System.out.printf("\n\nComputer got Ace of %s\n\n",computerSuit);
                break;
            case 11:
                System.out.printf("\n\nComputer got Jack of %s\n\n",computerSuit);
                break;
            case 12:
                System.out.printf("\n\nComputer got Queen of %s\n\n",computerSuit);
                break;
            case 13:
                System.out.printf("\n\nComputer got King of %s\n\n",computerSuit);
                break;
            default:
                System.out.printf("\n\nComputer got %d of %s\n\n", computerHand, computerSuit);
                break;
        }

        if(yourHand > computerHand){
            System.out.println("You win");
        }else if(yourHand == computerHand){
            System.out.println("It's a tie");
        }else{
            System.out.println("You lose");
        }


    }

}
