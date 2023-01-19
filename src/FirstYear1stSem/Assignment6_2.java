import java.util.Scanner;

public class Assignment6_2 {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        String inputSting;

        int vowelCounter = 0;



        System.out.print("Enter text: ");
        inputSting = (scanf.nextLine()).toUpperCase();

        for(int i = 0; i < inputSting.length(); i++){

            switch (inputSting.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowelCounter++;
            }

        }

        System.out.println(vowelCounter + " vowels");

    }

}
