import java.util.Scanner;

public class ReverseInteger {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);
        int x;

        x = scanf.nextInt();
        System.out.println(reversInteger(x));


    }

    public static int reversInteger(int input){

        String reverse = "0";
        int input2 = Math.abs(input);
        int reversed;

        while(input2 > 0){

            reverse += input2%10;
            input2 /= 10;

        }

        reversed = (Integer.parseInt(reverse));

        if(input < 0) reversed *= -1;

        return reversed;

    }

}
