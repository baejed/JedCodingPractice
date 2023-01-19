import java.util.Scanner;

public class Assignment5_2 {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        String numbers = "";

        int input;
        int greatestNum = 0;
        int greatestNumOccurence = 0;



        System.out.print("Enter numbers: ");

        do{

            input = scanf.nextInt();
            System.out.print("");

            numbers += input + " ";

        }while(input != 0);

        System.out.println("\nInputted numbers: " + numbers);
        numbers = numbers.trim();

        for(int i = 0; i < numbers.length() - 1 ; i++){

            if(greatestNum < ((int)(numbers.charAt(i)-(int)('0')))) greatestNum = ((int)(numbers.charAt(i)-(int)('0')));

        }

        for(int i = 0; i < numbers.length() - 1; i++){
            if(greatestNum == ((int)(numbers.charAt(i)-(int)('0')))){
                greatestNumOccurence++;
            }
        }

        System.out.println("The largest number is " + greatestNum);
        System.out.println("The occurrence count of the largest number is " + greatestNumOccurence);

    }

}
