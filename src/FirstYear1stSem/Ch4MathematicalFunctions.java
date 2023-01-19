import java.util.Scanner;

public class Ch4MathematicalFunctions {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        //side length
        double sideA, sideB, sideC;

        //vertices
        double x1,y1, x2,y2, x3,y3;

        //angles
        double angA, angB, angC;
    


        System.out.print("Enter the first corner's x coordinate: ");
        x1 = scanf.nextDouble();
        System.out.print("Enter the first corner's y coordinate: ");
        y1 = scanf.nextDouble();

        System.out.print("Enter the second corner's x coordinate: ");
        x2 = scanf.nextDouble();
        System.out.print("Enter the second corner's y coordinate: ");
        y2 = scanf.nextDouble();

        System.out.print("Enter the third corner's x coordinate: ");
        x3 = scanf.nextDouble();
        System.out.print("Enter the third corner's y coordinate: ");
        y3 = scanf.nextDouble();



        sideA = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        sideB = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        sideC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        System.out.println("\nSide A is " + sideA);
        System.out.println("Side B is " + sideB);
        System.out.println("Side C is " + sideC);

        angA = Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2))/(2*sideA*sideC));
        angB = Math.acos((Math.pow(sideB, 2) + Math.pow(sideA, 2) - Math.pow(sideC, 2))/(2*sideB*sideA));
        angC = Math.acos((Math.pow(sideC, 2) + Math.pow(sideB, 2) - Math.pow(sideA, 2))/(2*sideC*sideB));

        System.out.printf("\nAngle A is %.2f radians or %.2f°",angA, ((angA)*180)/Math.PI);
        System.out.printf("\nAngle B is %.2f radians or %.2f°",angB, ((angB)*180)/Math.PI);
        System.out.printf("\nAngle C is %.2f radians or %.2f°",angC, ((angC)*180)/Math.PI);

    }

}
