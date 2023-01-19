import java.util.*;

public class ThreeNumberComparison {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        int num1, num2, num3;



        System.out.print("Input first number: ");
        num1 = scanf.nextInt();

        System.out.print("\nInput second number: ");
        num2 = scanf.nextInt();

        System.out.print("\nInput third number: ");
        num3 = scanf.nextInt();



        if(num1 == num2 && num1 == num3){

            System.out.println("\nAll three numbers are equal");
            System.exit(0);


        }else if(num1 != num2 && num1 != num3){

            System.out.println("\nAll three numbers are not equal");
            System.exit(0);

        }else{

            System.out.println("\nNeither all of the three numbers are equal nor not equal");
            System.exit(0);

        }

    }

}
