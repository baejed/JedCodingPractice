import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

import static FirstYear2ndSem.Startup.typeInSearchBar;

public class Test {

    static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]) throws IOException, AWTException, InterruptedException {

        char[][] seatingPlan = new char[13][6];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Initialize seating plan with random assignments
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 2) {
                    // First class
                    seatingPlan[i][j] = rand.nextBoolean() ? 'X' : '*';
                } else if (i < 7) {
                    // Business class
                    seatingPlan[i][j] = rand.nextBoolean() ? 'X' : '*';
                } else {
                    // Economy class
                    seatingPlan[i][j] = rand.nextBoolean() ? 'X' : '*';
                }
            }
        }

        // Prompt user for ticket type and desired seat
        System.out.print("Enter ticket type (1 for First Class, 2 for Business Class, 3 for Economy Class): ");
        int ticketType = scanner.nextInt();
        System.out.print("Enter desired seat (e.g. 3A): ");
        String seat = scanner.next();

        // Convert seat string to row and column indices
        int row = Integer.parseInt(seat.substring(0, seat.length() - 1)) - 1;
        int col = seat.charAt(seat.length() - 1) - 'A';

        // Check if seat is available for the chosen ticket type
        while (true) {
            if (ticketType == 1 && row < 2 && seatingPlan[row][col] == '*') {
                seatingPlan[row][col] = 'X';
                break;
            } else if (ticketType == 2 && row >= 2 && row < 7 && seatingPlan[row][col] == '*') {
                seatingPlan[row][col] = 'X';
                break;
            } else if (ticketType == 3 && row >= 7 && seatingPlan[row][col] == '*') {
                seatingPlan[row][col] = 'X';
                break;
            } else {
                System.out.print("Seat not available. Please choose another seat: ");
                seat = scanner.next();
                row = Integer.parseInt(seat.substring(0, seat.length() - 1)) - 1;
                col = seat.charAt(seat.length() - 1) - 'A';
            }
        }

        // Print seating plan
        System.out.println("           A B C D E F ");
        for (int i = 0; i < 13; i++) {
            System.out.print(String.format("Row %2d", i+1));
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + seatingPlan[i][j]);
            }
            System.out.println();
        }

    }


//    public static boolean isValid(String s) {
//
//        if(s.length()%2 == 1) return false;
//
//        for(int i = 0; i < s.length() - 1; i++){
//
//            if(s.charAt(i) == '.') continue;
//
//            for(int j = i + 1; j < s.length(); j++){
//                if(s.charAt(j) == '.') continue;
//
//                if(s.charAt(i) == '[' && s.charAt(j) == ']'){
//                    s.replaceFirst("[", ".");
//                     s.replaceFirst("]", ".");
//                    break;
//                }
//
//                if(s.charAt(i) == '(' && s.charAt(j) == ')'){
//                    s.replaceFirst("(", ".");
//                    s.replaceFirst(")", ".");
//                    break;
//                }
//
//                if(s.charAt(i) == '{' && s.charAt(j) == '}'){
//                    s.replaceFirst("{", ".");
//                    s.replaceFirst("}", ".");
//                    break;
//                }
//
//                if(j == s.length() - 1) return false;
//
//            }
//        }
//
//        return true;
//
//    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] empty = {}, twoDArray = new int[n][m];

        if (m * n < original.length) return empty;

        for (int i = 0, column = 0, row = 0; i < original.length; i++, row++) {
            if (row == n) {
                column++;
                row = 0;
            }
            twoDArray[column][row] = original[i];
        }

        return twoDArray;

    }

    public static int arrangeCoins(int n) {

        int rowCounter = 0, rowBuilder = (int) Math.ceil(n / 2.0);

        for (int i = 0; i < Math.ceil(n / 2.0); i++, rowBuilder--, rowCounter++) {
            n -= rowBuilder;
            if (n < 0) break;
        }

        return rowCounter;

    }

    public static boolean isHappy(int n) {
        String nums = "";
        int i, num;
        nums += n;


        do {

            num = 0;

            for (i = 0; i < nums.length(); i++) {
                num += Math.pow((nums.charAt(i) - '0'), 2);
            }

            if (num > 100) return false;

        } while (num != 1);

        return true;
    }

    public static boolean isSubsequence(String s, String t) {

        for (int i = 0, j = 0; i < s.length(); i++) {

            for (; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    continue;
                }

            }

        }

        return true;

    }

    public static int[] plusOne(int[] digits) {

        int arrToInt = 0;
        int zeros = 1, newArrLength;
        int[] answer;
        String digitCounter = "";


        for (int i = digits.length - 1; i >= 0; i--) {

            arrToInt += digits[i] * (zeros * 10);
            zeros *= (zeros * 10);

        }

        arrToInt++;
        newArrLength = digits.length;
        digitCounter += arrToInt / 10;

        if (newArrLength != digits.length) answer = new int[newArrLength];
        else answer = new int[digits.length];

        for (int i = answer.length - 1; i >= 0; i--) {

            answer[i] = arrToInt % 10;
            arrToInt /= 10;

        }

        return answer;

    }

//    public static boolean isValid(String s) {
//
//        for(int i = 0; i < s.length(); i += 2){
//
//            switch(s.charAt(i)){
//                case '(':
//                    if(s.charAt(i+1) != ')') return false;
//                    break;
//                case '[':
//                    if(s.charAt(i+1) != ']') return false;
//                    break;
//                case '{':
//                    if(s.charAt(i+1) != '}') return false;
//                    break;
//            }
//
//        }
//
//        return true;
//
//    }

    public static int[] twoSum(int[] nums, int target) {

        int[] answer = {0, 0};

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if ((nums[i] + nums[j]) == target) {

                    answer[0] = i;
                    answer[1] = j;

                }

            }

        }

        return answer;

    }

    public static void storeRegister(int qtyOfOranges, int qtyOfEggs, int qtyOfApples, int qtyOfWatermelons, int qtyOfBagels) {

        double orangePrice = 2.99 / 10, eggPrice = 1.69 / 12, applePrice = 1.00 / 3, watermelonPrice = 4.39, bagelPrice = 3.50 / 6; //Prices for each product
        double totalBill; //The total price for all purchased products

        double orangeTotal, eggsTotal, applesTotal, watermelonsTotal, bagelsTotal; //The total price for each purchased product

        orangeTotal = orangePrice * qtyOfOranges;
        eggsTotal = eggPrice * qtyOfEggs;
        applesTotal = applePrice * qtyOfApples;
        watermelonsTotal = watermelonPrice * qtyOfWatermelons;
        bagelsTotal = bagelPrice * qtyOfBagels;

        System.out.printf("\nOranges: $%.2f\n", orangeTotal);
        System.out.printf("Eggs: $%.2f\n", eggsTotal);
        System.out.printf("Apples: $%.2f\n", applesTotal);
        System.out.printf("Watermelons: $%.2f\n", watermelonsTotal);
        System.out.printf("Bagels: $%.2f\n", bagelsTotal);

        totalBill = orangeTotal + eggsTotal + applesTotal + watermelonsTotal + bagelsTotal;

        System.out.printf("\nTotal bill: $%.2f", totalBill);

    }

}