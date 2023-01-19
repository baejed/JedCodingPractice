import java.util.Scanner;

public class Assignment3_1 {

    public static void main(String args[]){

        double[] prices = {1.25, .75, .90, .75, 1.50, .75};
        int itemNo = -1;
        float sumOfMoney, change, insufficientFund;

        Scanner scanf = new Scanner(System.in);


        do{
            System.out.print("Enter an item number: ");
            itemNo += scanf.nextInt();

            System.out.print("Enter cash amount: ");
            sumOfMoney = scanf.nextFloat();

            if(itemNo > 5){
                System.out.println("Item number " + (itemNo + 1) + " does not exist, please try again\n");
            }
        }while(itemNo > 5);


        if(sumOfMoney > prices[itemNo]){
            change = (float)(sumOfMoney - prices[itemNo]);
            System.out.printf("\nThank you for buying item %d. Your change is $%.2f", itemNo + 1, change);
        }else{
            insufficientFund = Math.abs((float)(sumOfMoney - prices[itemNo]));
            System.out.printf("\nPlease insert another $%.2f", insufficientFund);
        }

    }


}