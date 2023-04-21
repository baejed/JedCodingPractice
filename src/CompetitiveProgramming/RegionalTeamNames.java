package CompetitiveProgramming;

import java.util.Scanner;

public class RegionalTeamNames {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        String institution = "";
        String teamName = "";
        String fullName;
        boolean teamNameApproved = false;
        boolean institutionApproved = false;

        do{
            fullName = scanf.nextLine().trim();
        }while(fullName.length() > 80);

        for(int i = 0; i < fullName.length(); i++){
            if(fullName.charAt(i) == '-'){
                institution = fullName.substring(0, i);
                teamName = fullName.substring(i + 1, fullName.length());
                break;
            }
        }

        if(institution.length() > 1 && institution.length() <= 8)
            institutionApproved = true;

        if(teamName.length() > 0 && teamName.length() <= 24)
            teamNameApproved = true;

        if(teamNameApproved && institutionApproved)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
