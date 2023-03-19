package FirstYear2ndSem;

import java.util.Scanner;

public class FinalLabExam {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        Hangman hangman = new Hangman("JosephTristanSubong", 3);

        System.out.println("Welcome to Joseph's Hangman");
        System.out.println("\nDisguised word: " + hangman.getDisguisedWord() + "\n");

        while (!hangman.gameOver()) {
            System.out.print("Enter guess: ");
            hangman.makeGuess(scanf.next().charAt(0));

            System.out.printf("Incorrect guesses: %d/%d\n", hangman.getNumOfIncorrectGuesses(), hangman.getMaxNumOfIncorrectGuesses());
            System.out.println("Disguised word: " + hangman.getDisguisedWord() + "\n");

            if(hangman.isFound()) break;
        }

        if(hangman.gameOver()){
            System.out.println("Game Over");
            System.out.println("The correct word is " + hangman.getSecretWord());
        }else {
            System.out.println("Congratulations!!! You won!!!");
            System.out.printf("It took you %d guesses to complete the word", hangman.getNumOfGuessesMade());
        }

    }
}

class Hangman {

    private String secretWord;
    private String disguisedWord = "";
    private int numOfGuessesMade = 0;
    private int numOfIncorrectGuesses = 0;
    private int maxNumOfIncorrectGuesses;

    Hangman(String secretWord, int maxNumOfIncorrectGuesses) {

        this.secretWord = secretWord;
        this.maxNumOfIncorrectGuesses = maxNumOfIncorrectGuesses;

        for (int i = 0; i < secretWord.length(); i++) {
            disguisedWord += '?';
        }

    }

    public void makeGuess(char wordGuess) {

        String upperCase = "" + wordGuess;
        wordGuess = upperCase.toUpperCase().charAt(0);

        if (!gameOver()) {
            char[] disguisedWordArr = disguisedWord.toCharArray();

            boolean correctGuess = false;
            numOfGuessesMade++;

            for (int i = 0; i < secretWord.length(); i++) {
                if (wordGuess == secretWord.toUpperCase().charAt(i)) {
                    disguisedWordArr[i] = secretWord.charAt(i);
                    correctGuess = true;
                }
            }

            disguisedWord = "";

            for (int i = 0; i < secretWord.length(); i++) {
                disguisedWord += disguisedWordArr[i];
            }

            if (!correctGuess) numOfIncorrectGuesses++;
        }

    }

    public String getDisguisedWord() {
        return disguisedWord;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public int getNumOfIncorrectGuesses() {
        return numOfIncorrectGuesses;
    }

    public int getMaxNumOfIncorrectGuesses() {
        return maxNumOfIncorrectGuesses;
    }

    public int getNumOfGuessesMade() {
        return numOfGuessesMade;
    }

    public boolean isFound() {

        for (int i = 0; i < disguisedWord.length(); i++) {
            if (disguisedWord.charAt(i) == '?') return false;
        }

        return true;

    }

    public boolean gameOver() {

        if (maxNumOfIncorrectGuesses == numOfIncorrectGuesses) return true;
        else return false;

    }

}

/*

    Added features:
        gameOver() method: Checks if the game is over by comparing the number of incorrect guesses to the max num of wrong guesses
        makeGuess() method: Only runs if the instance variable gameOver is false
        maxNumOfIncorrectGuesses instance variable: It stores the maximum number of incorrect guesses, it is initialized when constructing the object
        char[] disguisedWordArr: For ease in modifying the disguised word

 */