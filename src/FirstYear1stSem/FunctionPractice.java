import java.util.Scanner;

public class FunctionPractice {

    public static void main(String args[]){

        String passwordSet;
        String passwordInput;

        int diff;

        Scanner scanf = new Scanner(System.in);

        System.out.print("Set password: ");
        passwordSet = scanf.nextLine();

        System.out.print("\nConfirm password: ");
        passwordInput = scanf.nextLine();

        diff = compare(passwordSet,passwordInput);

        if(diff != 0){

            for(int i = 0; i <= 1 && diff != 0; i++){

                System.out.println("Invalid password");

                System.out.print("\nConfirm password: ");
                passwordInput = scanf.nextLine();

                diff = compare(passwordSet,passwordInput);


            }

        }

        if(diff == 0){

            System.out.println("You have successfully confirm your password!!!");

        }else{

            System.out.println("Invalid password!!!\n Try again later");

        }

    }

    public static int compare(String first, String second){

        char[] firstArray, secondArray;

        firstArray = first.toCharArray();
        secondArray = second.toCharArray();

        int charCount;
        int i;
        int diff = 0;
        int diffValue = 0;

        charCount = firstArray.length;

        if(firstArray.length != secondArray.length){

            diff = 1;

            return diff;

        }

        for(i = 0; i < charCount; i++){

            diff = firstArray[i] - secondArray[i];

            diffValue = diffValue + diff;

        }

        return diff;

    }

}
