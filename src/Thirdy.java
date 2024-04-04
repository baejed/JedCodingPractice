import java.util.Scanner;

public class Thirdy {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        String machineName;
        String answer = "YES";
        int machineNumber;
        int quantity;

        do{
            machineNumber = scanf.nextInt();
            quantity = scanf.nextInt();
            machineName = getMachineName(machineNumber);
            if(machineName == null){
                System.out.println("Error! Try Again");
                continue;
            }
            getCraftingMaterials(machineName, quantity);
            scanf.nextLine();
            answer = scanf.nextLine().toUpperCase();
        }while (answer.equals("YES"));

    }

    public static String getMachineName(int machineNumber) {
        String[] machineNames = {"Keg", "Tapper", "Furnace", "Cask", "Lightning Rod", "Iridium Sprinkler"};
        try {
            return machineNames[machineNumber - 1];
        } catch (Exception e) {
            return null;
        }
    }

    public static void getCraftingMaterials(String machineName, int quantity) {
        if (machineName == null) {
            System.out.println("Machine name is null");
            return;
        }
        String output = "";
        int coalAmount = 0;
        switch (machineName) {
            case "Keg":
                output += "Keg Materials\n";
                output += "Wood = " + 30 * quantity + "\n";
                output += "Copper Ore = " + 5 * quantity + "\n";
                coalAmount += quantity;
                output += "Iron Ore = " + 5 * quantity + "\n";
                coalAmount += quantity;
                output += "Oak Resin = " + quantity + "\n";
                output += "Coal = " + coalAmount + "\n";
                break;
            case "Tapper":
                output += "Tapper Materials\n";
                output += "Wood = " + 40 * quantity + "\n";
                output += "Copper Ore = " + 10 * quantity + "\n";
                coalAmount += 2 * quantity;
                output += "Coal = " + coalAmount + "\n";
                break;
            case "Furnace":
                output += "Furnace Materials\n";
                output += "Stone = " + 25 * quantity + "\n";
                output += "Copper Ore = " + 20 * quantity + "\n";
                break;
            case "Cask":
                output += "Cask Materials\n";
                output += "Wood = " + 20 * quantity + "\n";
                output += "Hardwood = " + quantity + "\n";
                break;
            case "Lightning Rod":
                output += "Lightning Rod Materials\n";
                output += "Iron Ore = " + 5 * quantity + "\n";
                coalAmount += quantity;
                output += "Quartz = " + quantity + "\n";
                coalAmount += quantity;
                output += "Bat Wing = " + 5 * quantity + "\n";
                output += "Coal = " + coalAmount + "\n";
                break;
            case "Iridium Sprinkler":
                output += "Iridium Sprinkler Materials\n";
                output += "Gold Ore = " + 5 * quantity + "\n";
                coalAmount += quantity;
                output += "Iridium Ore = " + 5 * quantity + "\n";
                coalAmount += quantity;
                output += "Battery Pack = " + quantity + "\n";
                output += "Coal = " + coalAmount + "\n";
                break;
            default:
                output += "Machine does not exist";
        }
        System.out.println(output);
    }


}