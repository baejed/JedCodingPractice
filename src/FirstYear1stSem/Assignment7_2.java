package FirstYear1stSem;

import java.util.Scanner;

public class Assignment7_2{

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        int qtyOfOranges, qtyOfEggs, qtyOfApples, qtyOfWatermelons, qtyOfBagels;
        double total;

        System.out.println("How many of the following would you like to buy?");

        System.out.print("Oranges: ");
        qtyOfOranges = scanf.nextInt();

        System.out.print("Eggs: ");
        qtyOfEggs = scanf.nextInt();

        System.out.print("Apples: ");
        qtyOfApples = scanf.nextInt();

        System.out.print("Watermelons: ");
        qtyOfWatermelons = scanf.nextInt();

        System.out.print("Bagels: ");
        qtyOfBagels = scanf.nextInt();

        storeRegister(qtyOfOranges,qtyOfEggs,qtyOfApples,qtyOfWatermelons,qtyOfBagels);

    }

    public static void storeRegister(int qtyOfOranges, int qtyOfEggs, int qtyOfApples, int qtyOfWatermelons, int qtyOfBagels){

        double orangePrice = 2.99/10, eggPrice = 1.69/12, applePrice = 1.00/3, watermelonPrice = 4.39, bagelPrice = 3.50/6; //Prices for each product
        double totalBill; //The total price for all purchased products

        double orangeTotal, eggsTotal, applesTotal, watermelonsTotal, bagelsTotal; //The total price for each purchased product

        orangeTotal = orangePrice * qtyOfOranges;
        eggsTotal = eggPrice * qtyOfEggs;
        applesTotal = applePrice * qtyOfApples;
        watermelonsTotal = watermelonPrice * qtyOfWatermelons;
        bagelsTotal = bagelPrice * qtyOfBagels;

        System.out.printf("\nOranges: $%.2f\n",orangeTotal);
        System.out.printf("Eggs: $%.2f\n", eggsTotal);
        System.out.printf("Apples: $%.2f\n", applesTotal);
        System.out.printf("Watermelons: $%.2f\n", watermelonsTotal);
        System.out.printf("Bagels: $%.2f\n", bagelsTotal);

        totalBill = orangeTotal + eggsTotal + applesTotal + watermelonsTotal + bagelsTotal;

        System.out.printf("\nTotal bill: $%.2f", totalBill);

    }

}
