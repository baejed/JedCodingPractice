import java.util.Scanner;

public class SecondLabExam_Lucero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String binaryString;
        int[] binaryArr;


        System.out.println("Enter array elements: ");
        binaryString = scanner.nextLine();

        binaryArr = stringToIntArr(binaryString);

        if (isEvenParty(binaryArr))
            System.out.println("Even parity");
        else
            System.out.println("Odd parity");

        separateOnesAndZeroes(binaryArr);

        for(int num : binaryArr){
            System.out.print(num);
        }
    }

    public static int[] stringToIntArr(String binaryString) {
        int[] arr = new int[binaryString.length()];

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1')
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        return arr;
    }

    public static boolean isEvenParty(int[] binaryArr) {
        int numberOfOnes = 0;

        for (int i = 0; i < binaryArr.length; i++) {
            if (binaryArr[i] == 1)
                numberOfOnes++;
        }

        if (numberOfOnes % 2 == 0)
            return true;
        else
            return false;
    }

    public static void separateOnesAndZeroes(int[] binaryArr) {
        for (int i = 0; i < binaryArr.length - 1; i++) {

            if (binaryArr[i] == 0)
                continue;

            for (int j = i + 1; j < binaryArr.length; j++) {
                int temp;

                if (binaryArr[j] == 0) {
                    temp = binaryArr[i];
                    binaryArr[i] = binaryArr[j];
                    binaryArr[j] = temp;

                    break;
                }
            }
        }
    }

}
