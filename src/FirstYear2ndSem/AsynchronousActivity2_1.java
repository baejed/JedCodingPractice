package FirstYear2ndSem;

import java.util.Scanner;

public class AsynchronousActivity2_1 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int numOfStudents, bestScore;
        int[] studentScores;



        System.out.print("Enter number of students: ");
        numOfStudents = scanf.nextInt();

        studentScores = new int[numOfStudents];

        System.out.printf("Enter %d scores: ", numOfStudents);
        for(int i = 0; i < numOfStudents; i++){
            studentScores[i] = scanf.nextInt();
        }

        bestScore = getBestScore(studentScores);

        for(int i = 0; i < numOfStudents; i++){
            showStudentGrade(i, studentScores[i], bestScore);
        }

    }

    public static int getBestScore(int[] scores){

        int bestScore = scores[0];

        if(scores.length == 1) return bestScore;

        for(int i = 1; i < scores.length - 1; i++){
            bestScore = Math.max(bestScore,scores[i]);
        }

        return bestScore;

    }

    public static void showStudentGrade(int studentNumber, int studentScore, int bestScore){

        if(studentScore >= bestScore - 10)
            System.out.printf("Student %d's score is %d and grade is A\n", studentNumber, studentScore);
        else if(studentScore >= bestScore - 20)
            System.out.printf("Student %d's score is %d and grade is B\n", studentNumber, studentScore);
        else if(studentScore >= bestScore - 30)
            System.out.printf("Student %d's score is %d and grade is C\n", studentNumber, studentScore);
        else if(studentScore >= bestScore - 40)
            System.out.printf("Student %d's score is %d and grade is D\n", studentNumber, studentScore);
        else
            System.out.printf("Student %d's score is %d and grade is F\n", studentNumber, studentScore);

    }

}
