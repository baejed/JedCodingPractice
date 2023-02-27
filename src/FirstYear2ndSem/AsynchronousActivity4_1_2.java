package FirstYear2ndSem;

public class AsynchronousActivity4_1_2 {

    public static void main(String[] args) {

        //Number 1
        SuperDie die1 = new SuperDie();

        System.out.println("Number 1 tests:");
        System.out.println("Rolling 10 dice: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", die1.rollDie());
        }

        System.out.printf("\n\nThe die has %d sides\n\n", die1.sideCount());

        System.out.printf("The die currently has %d sides\n", die1.sideCount());
        die1.changeNumOfSides(8);
        System.out.printf("The die now has %d sides\n\n", die1.sideCount());


        //Number 2
        SuperDice dice = new SuperDice(5);
        int sum = 0;

        System.out.println("Number 2 tests: \n");

        dice.changeDieNumOfSides(0, 6);
        dice.changeDieNumOfSides(1, 20);
        dice.changeDieNumOfSides(2, 4);
        dice.changeDieNumOfSides(3, 8);
        dice.changeDieNumOfSides(4,12);
        System.out.println("Rolling the five dice with 6, 20, 4, 8, and 12 sides: ");
        System.out.printf("Average of the five dice: %.2f\n\n", (double)dice.rollAllDice()/dice.numOfDice());

        dice = new SuperDice(1,6);

        for (int i = 0; i < 100; i++){
            sum += dice.rollAllDice();
        }

        System.out.println("Rolling 100 single 6 sided dice: ");
        System.out.printf("Average: %.2f\n\n", (double)sum/100);

        sum = 0;
        dice = new SuperDice(3,6);

        for (int i = 0; i < 100; i++){
            sum += dice.rollAllDice();
        }

        System.out.println("Rolling 100 three 6 sided dice: ");
        System.out.printf("Average: %.2f\n\n", (double)sum/100);

        sum = 0;
        dice = new SuperDice(3,20);

        for (int i = 0; i < 100; i++){
            sum += dice.rollAllDice();
        }

        System.out.println("Rolling 100 three 20 sided dice: ");
        System.out.printf("Average: %.2f\n\n", (double)sum/100);

    }

}

class SuperDie {

    int sides = 0;


    public SuperDie(int sides) {
        this.sides = sides;
    }

    public SuperDie() {
        sides = 6;
    }

    public int rollDie() {
        return (int) (Math.random() * sides) + 1;
    }

    public int sideCount() {
        return sides;
    }

    public void changeNumOfSides(int sides) {
        this.sides = sides;
    }

}

class SuperDice {

    SuperDie[] dice;


    SuperDice() {
        dice = new SuperDie[1];
    }

    SuperDice(int n) {
        dice = new SuperDie[n];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new SuperDie(10);
        }
    }

    SuperDice(int p, int q) {
        dice = new SuperDie[p];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new SuperDie(q);
        }
    }

    public void changeDieNumOfSides(int dieIndex, int newNumOfSides) {
        dice[dieIndex].changeNumOfSides(newNumOfSides);
    }

    public int getDieSides(int dieIndex) {
        return dice[dieIndex].sideCount();
    }

    public int rollAllDice() {
        int diceSum = 0;

        for (int i = 0; i < dice.length; i++) {
            diceSum += dice[i].rollDie();
        }

        return diceSum;
    }

    public int numOfDice() {
        return dice.length;
    }

}
