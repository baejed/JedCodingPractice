package FirstYear2ndSem;

public class AsynchronousActivity3_1 {

    public static void main(String[] args) {

        String[] employees = {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8"};

        int[][] hoursWorked = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 7, 4, 8, 3, 8, 3},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totalHrsWorked = new int[7];



        for (int i = 0; i < hoursWorked.length; i++) {
            for (int j = 0; j < hoursWorked[i].length; j++) {
                totalHrsWorked[i] += hoursWorked[i][j];
            }
        }

        sort(employees, hoursWorked, totalHrsWorked);

        displayWorkerStats(employees, hoursWorked, totalHrsWorked);

    }

    public static void displayWorkerStats(String[] employees, int[][] hoursWorked, int[] totalHrsWorked){

        System.out.println("  Su M T W H F Sa Total Hours");

        for (int i = 0; i < hoursWorked.length; i++) {
            System.out.print(employees[i] + " ");
            for (int j = 0; j < hoursWorked[i].length; j++){
                System.out.print(hoursWorked[i][j] + " ");
            }
            System.out.println(totalHrsWorked[i] + " ");
        }

    }

    public static void sort(String[] employees, int[][] hoursWorked, int[] totalHrsWorked){

        String tempString;
        boolean errorPresent;
        int tempInt;

        do {
            errorPresent = false;

            for (int i = 0, j = i + 1; i < totalHrsWorked.length - 1; i++, j++) {
                if (totalHrsWorked[i] < totalHrsWorked[j]) {

                    tempString = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tempString;

                    for (int k = 0; k < hoursWorked.length; k++) {
                        tempInt = hoursWorked[i][k];
                        hoursWorked[i][k] = hoursWorked[j][k];
                        hoursWorked[j][k] = tempInt;
                    }

                    tempInt = totalHrsWorked[i];
                    totalHrsWorked[i] = totalHrsWorked[j];
                    totalHrsWorked[j] = tempInt;

                    errorPresent = true;
                }
            }
        } while (errorPresent);
    }

}
