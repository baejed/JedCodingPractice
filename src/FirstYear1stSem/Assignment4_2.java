import java.util.Scanner;

public class Assignment4_2 {

    public static void main(String args[]){



        Scanner scanf = new Scanner(System.in);

        int fiveDigit, oneDigit, twoDigit, threeDigit, fourDigit;

        System.out.print("Enter a five-digit number: ");
        fiveDigit = scanf.nextInt();

        oneDigit = fiveDigit/10000;
        twoDigit = fiveDigit/1000;
        threeDigit = fiveDigit/100;
        fourDigit = fiveDigit/10;

        if(oneDigit % 1 == 0 && twoDigit % 2 == 0 && threeDigit % 3 == 0 && fourDigit % 4 == 0 && fiveDigit % 5 == 0){
            System.out.println(fiveDigit + " is a friendly number");
        }else {
            System.out.println(fiveDigit + " is not a friendly number");
        }

    }

}
