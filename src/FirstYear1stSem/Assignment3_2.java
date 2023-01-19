import java.util.Scanner;

public class Assignment3_2 {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        int highTemp, lowTemp;



        System.out.print("Enter the day's high temperature: ");
        highTemp = scanf.nextInt();

        System.out.print("Enter the day's low temperature: ");
        lowTemp = scanf.nextInt();

        System.out.print("\n");

        if(highTemp >= 90){
            System.out.println("Heat warning!!!");
        }

        if(lowTemp < 32){
            System.out.println("Freeze warning!!!");
        }

        if(Math.abs(highTemp-lowTemp) > 40){
            System.out.println("Large temperature swing");
        }


    }

}
