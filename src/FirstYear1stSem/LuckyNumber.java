import java.util.*;

public class LuckyNumber {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        int fourDigitsInput;

        int firstDigit, secondDigit, thirdDigit, fourthDigit;

        int first2DigitsSum, last2DigitsSum;

        System.out.print("Enter a four-digit number: ");
        fourDigitsInput = scanf.nextInt();

        firstDigit = fourDigitsInput % 10; // firstDigit starts from the right
        secondDigit = (fourDigitsInput / 10) % 10;
        thirdDigit = (fourDigitsInput / 100) % 10;
        fourthDigit = (fourDigitsInput / 1000) % 10;

        first2DigitsSum = thirdDigit + fourthDigit;
        last2DigitsSum = firstDigit + secondDigit;

        if(first2DigitsSum == last2DigitsSum){

            System.out.print(fourDigitsInput + " is a lucky number!!!");
            System.exit(0);

        }else{

            System.out.print(fourDigitsInput + " is not a lucky number");
            System.exit(0);

        }


    }

}
