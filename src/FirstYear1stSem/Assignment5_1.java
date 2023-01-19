import java.util.Scanner;

public class Assignment5_1 {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        String digits = "";
        int sum = 0;
        int enteredNumber;


        System.out.print("Enter an integer: ");
        enteredNumber = Math.abs(scanf.nextInt());

        while(enteredNumber > 0){

            digits += enteredNumber%10;
            sum += enteredNumber%10;
            enteredNumber /= 10;

            if(enteredNumber > 0) digits += " ";

        }

        System.out.println(" ");

        for(int i = digits.length() - 1; i >= 0; i--){

            System.out.print(digits.charAt(i));

        }

        System.out.println("\nThe sum is: " + sum);

    }

}
