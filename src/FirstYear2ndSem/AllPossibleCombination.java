package FirstYear2ndSem;

public class AllPossibleCombination {

    public static void main(String[] args) {

        allPossibleCombination("code");

    }

    public static void allPossibleCombination(String string){

        String currentString = "";

        for(int i = 0; i < string.length(); i++){

            currentString = "";
            currentString += string.charAt(i);

            for(int j = 0; j < string.length(); j++){
                if(i == j) continue;
                currentString += string.charAt(j);
            }

            System.out.println(currentString);
        }
    }

}
