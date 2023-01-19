import java.util.Scanner;
import java.util.Random;

public class Blackjack_2 {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);
        Random rng = new Random();

        int[] cards = {1,2,3,4,5,6,7,8,9,10,10,10,10};
        int playerHand;
        int dealerHand;
        int playerCard1, playerCard2, dealerCard1, dealerCard2;
        int playerCounter;
        int dealerCounter;
        int hitCard;

        long start;

        double currentMoney = 500;
        int bet;

        String action, answer;

        boolean continuation = false;
        boolean acePresence, acePresenceDealer;



        System.out.println("Welcome to Jed's Blackjack\n");

        do{

            dealerHand = 0;
            playerHand = 0;
            acePresence = false;
            acePresenceDealer = false;
            playerCounter = 3;
            dealerCounter = 3;

            System.out.println("You currently have $" + currentMoney);

            do{
                System.out.print("Enter your bet amount: ");
                bet = scanf.nextInt();

                if(bet > currentMoney) System.out.println("Insufficient funds! Please try again\n");

            }while(bet > currentMoney);

            playerCard1 = cards[rng.nextInt(13)];
            playerCard2 = cards[rng.nextInt(13)];

            System.out.println("Card 1: " + playerCard1);
            System.out.println("Card 2: " + playerCard2);

            if(playerCard1 == 1 || playerCard2 == 1){
                playerHand = 10;
                acePresence = true;
            }

            playerHand += playerCard1 + playerCard2;

            System.out.println("Total Hand: " + playerHand);

            System.out.println("\n[H] Hit");
            System.out.println("[S] Stand");

            action = (scanf.nextLine()).toUpperCase();


            do{

                if(playerHand == 21) {
                    System.out.println("\nYou got a BLACKJACK!!!");

                    continuation = false;

                    continue;
                }

                System.out.print("Action: ");
                action = (scanf.nextLine()).toUpperCase();

                switch(action){
                    case "H":
                        hitCard = cards[rng.nextInt(13)];

                        playerHand += hitCard;

                        if(hitCard == 1 && (playerHand + 10) > 21){
                            playerHand += 10;
                            acePresence = true;
                        }

                        if(playerHand > 21 && acePresence){
                            playerHand -= 10;
                            acePresence = false;
                        }

                        System.out.println("\nCard " + playerCounter + ": " + hitCard);
                        System.out.println("Total Hand: " + playerHand);

                        playerCounter++;

                        if(playerHand > 21 && !acePresence){
                            System.out.println("BUST!!!");

                            continuation = false;
                        }else if(playerHand == 21){
                            System.out.println("BLACKJACK!!!");

                            continuation = false;
                        }else{
                            continuation = true;
                        }
                        break;

                    case "S":
                        System.out.println("\nTotal Hand: " + playerHand);
                        continuation = false;
                        break;

                    default:
                        System.out.println("Invalid input!!!\n");
                        continuation = true;
                        break;
                }
            }while(continuation);








            dealerCard1 = cards[rng.nextInt(13)];
            dealerCard2 = cards[rng.nextInt(13)];

            System.out.println("\n\nDealer's turn\n");
            System.out.println("Card 1: " + dealerCard1);
            System.out.println("Card 2: " + dealerCard2);

            if(dealerCard1 == 1 || dealerCard2 == 1){
                dealerHand += 10;
                acePresenceDealer = true;
            }

            dealerHand += dealerCard1 + dealerCard2;

            System.out.println("Dealer hand: " + dealerHand);

            if(dealerHand < playerHand && playerHand <= 21){

                do{
                    start = System.currentTimeMillis();
                    while(System.currentTimeMillis() - start < 1000){}

                    System.out.println("\n(Dealer Hits)");
                    hitCard = cards[rng.nextInt(13)];
                    System.out.println("Dealer card " + dealerCounter + ": " + hitCard);
                    dealerHand += hitCard;

                    if(hitCard == 1 && (dealerHand + 10) > 21){
                        dealerHand += 10;
                        acePresence = true;
                    }

                    if(dealerHand > 21 && acePresenceDealer){
                        dealerHand -= 10;
                        acePresenceDealer = false;
                    }

                    System.out.println("Dealer hand: " + dealerHand);

                    dealerCounter++;
                }while(dealerHand < playerHand && dealerHand < 21);

            }

            start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 1000){}

            if((dealerHand > playerHand && dealerHand < 21) || playerHand > 21 && dealerHand != 21){
                System.out.println("\n(Dealer stands)");
                System.out.println("Dealer hand: " + dealerHand + "\n");
                System.out.println("You lose");
                currentMoney -= bet;
                System.out.println("-$" + bet);
            }

            if(dealerHand > 21 && playerHand > 21){
                System.out.println("\nDealer and Player busted");
                currentMoney -= bet;
                System.out.println("-$" + bet);
            }else if(dealerHand > 21 && playerHand == 21){
                System.out.println("\nDealer busted \nYou win");
                currentMoney += (bet * 1.5);
                System.out.println("+$" + (bet*1.5));
            }else if(dealerHand == playerHand){
                System.out.println("\nIt's a tie");
                System.out.println("*Dealer pushed your chips*");
            }else if(playerHand > dealerHand && playerHand < 21){
                System.out.println("\nYou win!!!");
                currentMoney += bet;
                System.out.println("+$" + bet);
            }else if(dealerHand > 21 && playerHand < 21){
                System.out.println("\nDealer busted \nYou win");
                currentMoney += bet;
                System.out.println("+$" + bet);
            }else if(dealerHand == 21){
                System.out.println("\nDealer BLACKJACK!!! \nYou lose");
                currentMoney -= bet;
                System.out.println("-$" + bet);
            }

            System.out.print("\nDo you want to play again?: ");
            answer = (scanf.nextLine()).toUpperCase();
            System.out.println("\n");

        }while(answer.equals("YES"));
    }

}
