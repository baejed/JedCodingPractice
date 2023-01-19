import java.util.*;

public class LeapYearIdentifier {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        int year;
        int remainder = 1;

        System.out.print("Enter Year: ");
        year = scanf.nextInt();

        System.out.print("\n");

        if(year > 999){

            remainder = year%4;

        }else{

            System.out.println("Invalid Year");
            System.exit(0);

        }

        if(remainder == 0){

            System.out.print("Year " + year + " is a leap year");

        }else{

            System.out.print("Year " + year + " is a not leap year");

        }
    }

}
