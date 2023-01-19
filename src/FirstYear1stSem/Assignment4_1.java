import java.util.Scanner;

public class Assignment4_1 {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        String phoneNumber;
        String firstThreeDigits, nextThreeDigits, lastFourDigits;

        System.out.print("Enter phone number: ");
        phoneNumber = scanf.nextLine();

        firstThreeDigits = phoneNumber.substring(0,3);
        nextThreeDigits = phoneNumber.substring(3,6);
        lastFourDigits = phoneNumber.substring(6,10);

        System.out.print(firstThreeDigits + "-" + nextThreeDigits + "-" + lastFourDigits);

        switch(firstThreeDigits){
            case "800", "888", "877", "866":
                System.out.println(" is a toll-free number");
                break;

            default:
                System.out.println(" is not a toll-free number");
                break;
        }

    }

}
