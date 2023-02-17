package FirstYear2ndSem;

import java.util.Random;
import java.util.Scanner;

public class FirstLabExam {

    static Scanner scanf = new Scanner(System.in);

    public static void main(String[] args) {

        String userTicketType;

        char[][] seats = new char[13][6];
        boolean satisfied = false;

        fillSeatsRandomly(seats);

        System.out.println("Current seating plan");
        displaySeatingPlan(seats);

        System.out.print("Enter your ticket type: ");
        userTicketType = scanf.nextLine().trim().toUpperCase();

        seatChooser(userTicketType, seats);
        System.out.println("\nSeat acquired\n");

        System.out.println("New seating plan: ");
        displaySeatingPlan(seats);


    }

    public static void fillSeatsRandomly(char[][] seats) {

        Random seatFiller = new Random();
        char[] possibleSeatFill = {'*', 'X'};

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = possibleSeatFill[seatFiller.nextInt(2)];
            }
        }

    }

    public static void seatChooser(String userTicketType, char[][] seats) {

        int desiredRow, desiredColumn;
        boolean satisfied = false, ticketTypeAccepted;

        do {

            ticketTypeAccepted = true;

            switch (userTicketType) {
                case "FIRST CLASS":

                    do {
                        System.out.println("Choose your desired seat");

                        System.out.print("Enter your desired seat row: ");
                        desiredRow = scanf.nextInt() - 1;

                        System.out.print("Enter your desired seat column: ");
                        desiredColumn = scanf.nextInt() - 1;

                        if ((desiredRow == 0 || desiredRow == 1)) {
                            if (seats[desiredRow][desiredColumn] == 'X') {
                                System.out.println("Your desired seat is taken, please choose another one\n");
                                continue;
                            }
                            seats[desiredRow][desiredColumn] = 'X';
                            satisfied = true;
                        } else {
                            System.out.println("Your desired row is not eligible for your ticket type");
                            System.out.println("Please try again\n");
                        }

                    } while (!satisfied);

                    break;
                case "BUSINESS CLASS":

                    do {
                        System.out.println("Choose your desired seat");

                        System.out.print("Enter your desired seat row: ");
                        desiredRow = scanf.nextInt() - 1;

                        System.out.print("Enter your desired seat column: ");
                        desiredColumn = scanf.nextInt() - 1;

                        if ((desiredRow >= 2 && desiredRow <= 6)) {
                            if (seats[desiredRow][desiredColumn] == 'X') {
                                System.out.println("Your desired seat is taken, please choose another one\n");
                                continue;
                            }
                            seats[desiredRow][desiredColumn] = 'X';
                            satisfied = true;
                        } else {
                            System.out.println("Your desired row is not eligible for your ticket type");
                            System.out.println("Please try again\n");
                        }

                    } while (!satisfied);

                    break;
                case "ECONOMY CLASS":

                    do {
                        System.out.println("Choose your desired seat");

                        System.out.print("Enter your desired seat row: ");
                        desiredRow = scanf.nextInt() - 1;

                        System.out.print("Enter your desired seat column: ");
                        desiredColumn = scanf.nextInt() - 1;

                        if ((desiredRow >= 7 && desiredRow <= 12)) {
                            if (seats[desiredRow][desiredColumn] == 'X') {
                                System.out.println("Your desired seat is taken, pflease choose another one\n");
                                continue;
                            }
                            seats[desiredRow][desiredColumn] = 'X';
                            satisfied = true;
                        } else {
                            System.out.println("Your desired row is not eligible for your ticket type");
                            System.out.println("Please try again\n");
                        }

                    } while (!satisfied);

                    break;
                default:
                    System.out.println("Invalid Ticket Type");
                    ticketTypeAccepted = false;

                    System.out.print("Enter ticket type: ");
                    userTicketType = scanf.nextLine().trim().toUpperCase();

            }
        } while (!ticketTypeAccepted);
    }

    public static void displaySeatingPlan(char[][] seats) {

        char[] columns = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.print("      ");

        for (int i = 0; i < columns.length; i++) {
            System.out.print(columns[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < seats.length; i++) {

            System.out.print("Row " + (i + 1) + " ");

            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }

            System.out.println();

        }

    }

}