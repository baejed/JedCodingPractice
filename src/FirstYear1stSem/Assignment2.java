import java.util.Scanner;

public class Assignment2 {

    public static void main(String args[]){

        String employeeName;

        int hrsWorked;

        double hrlyPay, fedTaxRate, stateTaxRate;

        double grossPay, fedTax, stateTax, netPay;

        Scanner scanf = new Scanner(System.in);



        System.out.print("Enter employee's name: ");
        employeeName = scanf.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        hrsWorked = scanf.nextInt();

        System.out.print("Enter hourly pay rate: ");
        hrlyPay = scanf.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        fedTaxRate = scanf.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        stateTaxRate = scanf.nextDouble();
        //End of taking inputs

        grossPay = hrlyPay * hrsWorked;
        fedTax = grossPay * fedTaxRate;
        stateTax = grossPay * stateTaxRate;
        netPay = grossPay - (fedTax + stateTax);

        System.out.println("\n\nEmployee name: " + employeeName);
        System.out.println("Hours worked: " + hrsWorked);
        System.out.println("Pay rate: $" + hrlyPay);
        System.out.println("Gross pay: $" + grossPay);

        //Deductions
        System.out.println("\nDeductions:");
        System.out.printf("Federal Withholding (%.2f%%): $%.2f\n",fedTaxRate * 100, fedTax);
        System.out.printf("State Withholding (%.2f%%): $%.2f\n",stateTaxRate * 100, stateTax);
        System.out.printf("Total deduction: $%.2f\n",fedTax + stateTax);
        System.out.printf("Net pay: $%.2f",netPay);

        //Written by: Joseph Tristan Subong
    }

}
