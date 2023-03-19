package FirstYear2ndSem;

public class SecondLabExamFinal {

    public static void main(String[] args) {

        Grades cceGrades = new Grades();

        cceGrades.setGrades(0,3,6,2,1);
        cceGrades.readGrades(95);
        cceGrades.readGrades(89);

        System.out.println("Total number of grades: " + cceGrades.totalNumOfGrades() + "\n");

        cceGrades.drawBar();

    }

}

class Grades {

    private int[] gradeNums = new int[5]; //{A,B,C,D,F}

    Grades() {
    }

    public void setGrades(int A, int B, int C, int D, int F) {
        gradeNums[0] = A;
        gradeNums[1] = B;
        gradeNums[2] = C;
        gradeNums[3] = D;
        gradeNums[4] = F;
    }

    public void readGrades(int grade) {
        if(grade < 60)
            gradeNums[4]++;
        else if (grade < 70)
            gradeNums[3]++;
        else if (grade < 80)
            gradeNums[2]++;
        else if (grade < 90)
            gradeNums[1]++;
        else
            gradeNums[0]++;

    }

    public int totalNumOfGrades() {
        int total = 0;

        for (int i = 0; i < gradeNums.length; i++) {
            total += gradeNums[i];
        }

        return total;
    }

    public int getPercentageOfGradeNum(char grade) {
        int gradeIndex;
        double gradePercentage;

        String gradeUpperCase = "" + grade;
        grade = gradeUpperCase.toUpperCase().charAt(0);

        if (grade == 'F') {
            gradeIndex = 4;
        } else {
            gradeIndex = grade - 'A';
        }

        gradePercentage = (((double)gradeNums[gradeIndex] / totalNumOfGrades()) * 100);

        return (int)(Math.round(gradePercentage));

    }

    public void drawBar() {

        System.out.println("0  10    20   30   40   50   60   70   80   90   100%");
        System.out.println("|   |    |    |    |    |    |    |    |    |    |");
        System.out.println("**************************************************");

        for(int i = 0; i < Math.round(getPercentageOfGradeNum('A')/2.0); i++){
            System.out.print("*");
        }
        System.out.println(" A");

        for(int i = 0; i < Math.round(getPercentageOfGradeNum('B')/2.0); i++){
            System.out.print("*");
        }
        System.out.println(" B");

        for(int i = 0; i < Math.round(getPercentageOfGradeNum('C')/2.0); i++){
            System.out.print("*");
        }
        System.out.println(" C");

        for(int i = 0; i < Math.round(getPercentageOfGradeNum('D')/2.0); i++){
            System.out.print("*");
        }
        System.out.println(" D");

        for(int i = 0; i < Math.round(getPercentageOfGradeNum('F')/2.0); i++){
            System.out.print("*");
        }
        System.out.println(" F");

    }

}