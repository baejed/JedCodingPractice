import java.util.Scanner;

public class SecondLabExam {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int inputLimit, numOfInputs = 0;
        int letterBcounter, letterGcounter;
        int length;

        String inputs, outputs = "";


        System.out.print("Enter input limit: ");
        inputLimit = scanf.nextInt();

        System.out.println("Enter character names:");

        while(numOfInputs <= inputLimit){

            letterBcounter = 0;
            letterGcounter = 0;

            inputs = scanf.nextLine();
            length = inputs.length();
            if(length > 25) length = 25;



            for(int i = 0; i < length; i++){

                if((inputs.toUpperCase().charAt(i)) == 'B'){
                    letterBcounter ++;
                }else if((inputs.toUpperCase().charAt(i)) == 'G'){
                    letterGcounter ++;
                }

            }

            outputs += inputs ;

            if(letterBcounter > letterGcounter){
                outputs += " is A BADDY\n";
            }else if (letterGcounter > letterBcounter){
                outputs += " is GOOD\n";
            }else if(letterBcounter == letterGcounter && numOfInputs > 0){
                outputs += " is NEUTRAL\n";
            }

            numOfInputs++;
        }

        System.out.print("\n" + outputs);

    }

}
