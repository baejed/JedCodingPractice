package CompetitiveProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoStringsAttached {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        String firstString, secondString;
        int numOfInputs;

        //System.out.println(getLongestCommonSubstring("kanye is a genius", "you played yourself"));

        numOfInputs = scanf.nextInt();

        scanf.nextLine();

        for(int i = 0; i < numOfInputs; i++){
            firstString = scanf.nextLine();
            secondString = scanf.nextLine();
            if(i < numOfInputs - 1 && numOfInputs != 1)
                output.append(getLongestCommonSubstring(firstString, secondString) + "\n");
            else
                output.append(getLongestCommonSubstring(firstString, secondString) + "");
        }

        System.out.print(output);

    }

    public static String getLongestCommonSubstring(String firstString, String secondString) {

        String currentSubstring;
        int currentSubstringLength;
        List<String> commonSubstrings = new ArrayList<>();

        for (int i = 0; i < firstString.length(); i++) {
            for (int j = i + 1; j < firstString.length() + 1; j++) {
                boolean hasAdded = false;
                currentSubstring = firstString.substring(i, j);
                currentSubstringLength = currentSubstring.length();
                for (int k = 0; k < secondString.length() - currentSubstringLength + 1; k++) {
                    String secondSubstring = secondString.substring(k, k + currentSubstringLength);
//                    System.out.println("Comparing: " + " " + currentSubstring + " and " + secondSubstring);
                    if(currentSubstring.equals(secondSubstring)){
                        hasAdded = true;
                        commonSubstrings.add(currentSubstring);
//                        System.out.println("\n--------------------------");
//                        System.out.println("Common Substring: " + currentSubstring);
//                        System.out.println("--------------------------\n");
                    }
                }
                if(!hasAdded)
                    break;
            }
        }

        if(commonSubstrings.isEmpty())
            return "";

        String longestCommonSubstring = commonSubstrings.get(0);
        commonSubstrings.remove(0);

        for(int i = 0; i < commonSubstrings.size(); i++){
            longestCommonSubstring = (commonSubstrings.get(i).length() > longestCommonSubstring.length())
                    ? commonSubstrings.get(i)
                    : longestCommonSubstring;
        }

        return longestCommonSubstring;

    }

}
