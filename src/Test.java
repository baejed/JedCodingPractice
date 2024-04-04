import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import static FirstYear2ndSem.Startup.typeInSearchBar;

public class Test {

    public static void main(String args[]) throws IOException, InterruptedException, NoSuchAlgorithmException, AWTException {

        Scanner scanf = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = scanf.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print(fib1 + " " + fib2);

        while(true){
            int currentSum = fib1 + fib2;
            if(currentSum >= num) break;
            System.out.print(" " + currentSum);
            fib1 = fib2;
            fib2 = currentSum;
        }

    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static double Compute_half_life(double NT, double NO, double T) {
        if (NT >= NO || (NT == 0 || NO == 0)) return Double.NaN;
        double upper = (-1.0 * T) * (Math.log(2.0));
        double lower = (Math.log(NT) - Math.log(NO));

        return (double) Math.round((upper / lower) * 10000) / 10000;
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