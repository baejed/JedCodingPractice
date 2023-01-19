import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Bajed's Blackjack\n");

        int playerCard1, playerCard2;
        int dealerCard1, dealerCard2;
        int playerValue, dealerValue;

        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        int rng;

        char action;

        char outCome = 'x';

        Random random = new Random();

        rng = random.nextInt(12);
        playerCard1 = cards[rng];

        rng = random.nextInt(12);
        playerCard2 = cards[rng];

        playerValue = playerCard1 + playerCard2;

        System.out.println("Total hand: " + playerValue + "\n");
        System.out.print("Enter H to hit or S to stand: ");



        do {

            Scanner act = new Scanner(System.in);
            action = act.next().charAt(0);

            switch (action) {
                case 'H':
                    rng = random.nextInt(12);
                    playerValue = playerValue + cards[rng];
                    System.out.println("Total hand: " + playerValue + "\n");

                    if(playerValue > 21){
                        System.out.println("BUST!!!");
                        outCome = 'L';
                        action = 'S';
                    }else if(playerValue == 21){
                        System.out.println("BLACKJACK!!!");
                        outCome = 'W';
                        action = 'S';
                    }

                    break;

                case 'h':
                    rng = random.nextInt(12);
                    playerValue = playerValue + cards[rng];
                    System.out.println("Total hand: " + playerValue + "\n");

                    if(playerValue > 21) {
                        System.out.println("BUST!!!");
                        outCome = 'L';
                        action = 'S';
                    }else if(playerValue == 21){
                        System.out.println("BLACKJACK!!!");
                        outCome = 'W';
                        action = 'S';
                    }

                    break;

                case 'S':
                    playerValue = playerValue;
                    outCome = 'S';
                    action = 'S';
                    break;

                case 's':
                    playerValue = playerValue;
                    outCome = 'S';
                    action = 'S';
                    break;

                default:
                    System.out.println("\nInvalid input");
            }
        }while (action != 'S');

        if(outCome == 'S'){

            rng = random.nextInt(12);
            dealerCard1 = cards[rng];

            rng = random.nextInt(12);
            dealerCard2 = cards[rng];

            dealerValue = dealerCard1 + dealerCard2;

            System.out.println("Dealer's hand: " + dealerValue);

            if(dealerValue < playerValue){

                do{
                    System.out.println("(Dealer hits)");

                    rng = random.nextInt(12);
                    dealerValue = dealerValue + cards[rng];

                    System.out.println("Dealer's hand: " + dealerValue);
                }while(dealerValue <= playerValue && dealerValue < 21);

                if(dealerValue > 21){
                    System.out.println("\nDealer Busted \nDealer lost");
                    outCome = 'W';
                }else if(dealerValue > playerValue && dealerValue <= 21){
                    System.out.println("(Dealer stands)\nDealer wins!!!");
                    outCome = 'L';
                }else if(playerValue > dealerValue && playerValue <= 21){
                    outCome = 'W';
                }else if(playerValue == dealerValue){
                    System.out.println("DRAW");
                }

            }

        }

        if(outCome == 'L'){
            System.out.println("You lose");
        }else if(outCome == 'W'){
            System.out.println("You Win!!!");
        }

    }
}