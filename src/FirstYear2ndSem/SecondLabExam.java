package FirstYear2ndSem;

public class SecondLabExam {

    public static void main(String[] args) {

        Grade cce = new Grade();

        cce.setNumOfLetterGrades(1, 4, 6, 2, 1);
        //System.out.println(cce.readGradesNum('F'));
        //System.out.println(cce.getTotalNumOfGrades());
        //System.out.println(Math.round(cce.gradePercentage('A')));
        cce.drawBarGraph();

    }

}

class Grade {

    private int[] grades = new int[5]; // {A,B,C,D,F}
    private final char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};

    public void setNumOfLetterGrades(int A, int B, int C, int D, int F) {
        grades[0] = A;
        grades[1] = B;
        grades[2] = C;
        grades[3] = D;
        grades[4] = F;
    }

    public int readGradesNum(char letterGrade) {
        int gradeIndex;

        if (letterGrade == 'F') letterGrade = 'E';
        gradeIndex = letterGrade - 'A';

        return grades[gradeIndex];
    }

    public int getTotalNumOfGrades() {
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        return total;
    }

    public double gradePercentage(char letterGrade) {
        int gradeIndex;
        double gradePercentage;

        if (letterGrade == 'F') letterGrade = 'E';
        gradeIndex = letterGrade - 'A';

        gradePercentage = (double) grades[gradeIndex] / getTotalNumOfGrades() * 100;
        return gradePercentage;
    }

    public void drawBarGraph() {
        int[] gradePercentages = new int[5];
        char letterGrade = 'A';

        for (int i = 0; i < gradePercentages.length; i++, letterGrade++) {
            if (letterGrade == 'E') letterGrade++;
            gradePercentages[i] = (int) Math.round(gradePercentage(letterGrade));
            System.out.println(gradePercentages[i]);
        }

//        for(int i = 0; i < 10; i++){
//            System.out.print("    " + (i+1)*10);
//        }
//        System.out.println("%");
//
//        for(int i = 0; i < 10; i++){
//            System.out.print("     |");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 50; i++) {
//            System.out.print("*");
//            if ((i + 1) % 5 == 0) System.out.print(" "); //System.out.print(((i + 1) / 5) * 10 + "%");
//        }
//
//        System.out.println();

        System.out.println("0   10   20   30   40   50   60   70   80   90   100");
        System.out.println("|   |    |    |    |    |    |    |    |    |     | ");
        System.out.println("***************************************************");

        for(int i = 0; i < gradePercentages.length; i++){
            for(int j = 0; j < Math.round(gradePercentages[i]/2.0); j++){
                System.out.print("*");
            }
            System.out.println(" " + letterGrades[i]);
        }

    }

}
