import java.util.*;

public class BankingSystem {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        int pin;
        int menuChoice;

        boolean continuity = false;

        double depositAmount;
        double withdrawAmount;
        double accountBalance = 0;

        long start;



        System.out.println("Welcome to the Bank of BAJED\n");

        System.out.print("Enter your PIN: ");
        pin = scanf.nextInt();

        if(pin == 1234){

            System.out.print("\nConfirming PIN.");

            start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 1000){} //delays for the wait time

            System.out.print(".");

            start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 1000){} //delays for the wait time

            System.out.print(".");

            start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 1000){} //delays for the wait time

            System.out.print(".");

            start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 1000){} //delays for the wait time

            System.out.print("\nPIN Confirmed!!!");

            start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 1000){} //delays for the wait time

            do{

                System.out.println("\n\nMENU");
                System.out.println("[1] Deposit");
                System.out.println("[2] Withdraw");
                System.out.println("[3] Check balance");
                System.out.println("[4] Exit");
                System.out.print("Enter your inquiry: ");

                menuChoice = scanf.nextInt();

                switch(menuChoice){

                    case 1:
                        System.out.print("\nEnter deposit amount: ");
                        depositAmount = scanf.nextDouble();

                        accountBalance = accountBalance + depositAmount;

                        System.out.print("\nTransaction complete");
                        continuity = true;
                        break;

                    case 2:
                        System.out.print("\nEnter withdraw amount: ");
                        withdrawAmount = scanf.nextDouble();

                        withdrawAmount = withdrawAmount + (withdrawAmount * 0.02);

                        if(withdrawAmount > accountBalance){

                            System.out.println("\nInsufficient funds");
                            System.out.println("\n[1] Exit");
                            System.out.print("Enter your inquiry: ");
                            menuChoice = scanf.nextInt();

                        }else{

                            accountBalance = accountBalance - withdrawAmount;

                            System.out.print("\nTransaction complete");

                        }

                        continuity = true;
                        break;

                    case 3:
                        System.out.println("\nYour current balance is: ₱" + accountBalance);
                        System.out.println("[1] Exit");
                        System.out.print("Enter your inquiry: ");
                        menuChoice = scanf.nextInt();

                        break;

                    case 4:
                        System.out.print("\nThank you for banking with us");
                        System.exit(0);
                        break;

                    default:
                        System.out.print("\nInvalid input");
                        continuity = true;

                        break;
                }

            }while(continuity == true || menuChoice == 1);




        }else{

            System.out.println("\n\nInvalid pin!!!");
            System.out.print("Please try again\n\n");
            System.exit(0);

        }

    }

}
