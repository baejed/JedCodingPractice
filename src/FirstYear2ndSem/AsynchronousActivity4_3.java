package FirstYear2ndSem;

import java.util.Scanner;

public class AsynchronousActivity4_3 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        Counter counter = new Counter();
        int input;


        System.out.println("Enter numbers:");
        while (true) {

            input = scanf.nextInt();
            if (input == 0) break;

            counter.addOne();

        }

        System.out.println("Number of non-zero integers entered: " + counter.retrieveCounter());

    }

}

class Counter {

    int counter;


    Counter() {
        counter = 0;
    }

    Counter(int nonNegativeInt) {
        counter = nonNegativeInt;
    }

    public void addOne() {
        counter++;
    }

    public void setCounterToZero() {
        counter = 0;
    }

    public int retrieveCounter() {
        return counter;
    }

}
