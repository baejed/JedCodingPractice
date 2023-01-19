import java.util.*;

public class BloodDonor {

    public static void main(String args[]){

        int weight;
        int age;

        Scanner scanf = new Scanner(System.in);



        System.out.println("Welcome to Bajed's Blood Drive");

        System.out.print("Enter your age: ");
        age = scanf.nextInt();

        System.out.print("\nEnter your weight: ");
        weight = scanf.nextInt();

        if(age >= 18){

            if(weight >= 50){

                System.out.println("Congratulations!!! You are eligible to donate blood.");
                System.out.println("The medical team will be with you shortly");

            }else{

                System.out.println("\nYou must be at least at the weight of 50kg and above to donate");
                System.exit(0);

            }

        }else{

            System.out.println("\nYou must be at the age of 18 to donate blood");
            System.exit(0);

        }

    }

}
