import java.util.Scanner;

public class FirstLabExamRetake {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        char serviceCode;
        int minutesUsed, minutesUsedDay, minutesUsedNight;
        int accountNum;
        double amountDue;



        System.out.print("Enter Account Number: ");
        accountNum = scanf.nextInt();

        System.out.print("Enter Service code: ");
        serviceCode = scanf.next().charAt(0);

        switch(serviceCode){
            case 'p':
            case 'P':
                amountDue = 25;

                System.out.print("Enter Number of Minutes Used During The Day: ");
                minutesUsedDay = scanf.nextInt();

                System.out.print("Enter Number of Minutes Used During The Night: ");
                minutesUsedNight = scanf.nextInt();

                if(minutesUsedDay > 75){
                    amountDue += (minutesUsedDay - 75) * 0.1;
                }

                if(minutesUsedNight > 100){
                    amountDue += (minutesUsedNight - 100) * 0.05;
                }

                System.out.println("\n\nAccount Number: " + accountNum);
                System.out.println("Service Code: Premium");
                System.out.println("Number of Minutes Used During The Day: " + minutesUsedDay);
                System.out.println("Number of Minutes Used During The Night: " + minutesUsedNight);
                System.out.printf("Amount Due: $%.2f\n", amountDue);
                break;

            case 'R':
            case 'r':
                amountDue = 10;

                System.out.print("Number of Minutes Used: ");
                minutesUsed = scanf.nextInt();

                if(minutesUsed > 50){
                    amountDue += (minutesUsed - 50) * 0.2;
                }

                System.out.println("\n\nAccount Number: " + accountNum);
                System.out.println("Service Code: Regular");
                System.out.println("Number of Minutes Used: " + minutesUsed);
                System.out.printf("Amount Due: $%.2f\n", amountDue);
                break;

            default:
                System.out.println("\nInvalid input");
                break;
        }
    }

}
