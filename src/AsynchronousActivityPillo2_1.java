import java.util.Scanner;

public class AsynchronousActivityPillo2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] studentScores;
        int numberOfStudents, bestScore;

        System.out.print("Enter number of Students: ");

        numberOfStudents = scanner.nextInt();
        studentScores = new int[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores");
        for (int i = 0; i < numberOfStudents; i++) studentScores[i] = scanner.nextInt();

        bestScore = studentScores[0];
        for (int i = 1; i < numberOfStudents; i++) bestScore = (bestScore > studentScores[i]) ? bestScore : studentScores[i];

        for(int i = 0; i < numberOfStudents; i++){
            if(studentScores[i] >= bestScore - 10) System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is A");
            else if(studentScores[i] >= bestScore - 20) System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is B");
            else if(studentScores[i] >= bestScore - 30) System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is C");
            else if(studentScores[i] >= bestScore - 40) System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is D");
            else System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is F");
        }


    }

}
