import java.util.Scanner;

public class AsynchronousActivityPillo2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[1000], occurrences = new int[101];
        int count = 0;

        System.out.print("Enter the integers between 1 and 100: ");

        do{
            inputs[count] = scanner.nextInt();
            count++;
        }while(inputs[count - 1] != 0);

        for(int i = 0; i < count; i++){
            occurrences[inputs[i]]++;
        }

        for(int i = 1; i < occurrences.length; i++){
            if (occurrences[i] == 0) continue;
            System.out.printf("%d occurs %d times\n", i, occurrences[i]);
        }

    }

}
