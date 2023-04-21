package CompetitiveProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InformationTracker {

    public static void main(String[] args) {

        List<Integer> knowledgeableFriends = new ArrayList<>();
        Scanner scanf = new Scanner(System.in);

        int numOfFriends, numOfInputs;
        int[] meetingFriends = new int[2];


        knowledgeableFriends.add(1);

        numOfFriends = scanf.nextInt();
        numOfInputs = scanf.nextInt();

        for(int i = 0; i < numOfInputs;){
            meetingFriends[0] = scanf.nextInt();
            meetingFriends[1] = scanf.nextInt();

            if(meetingFriends[0] > numOfFriends || meetingFriends[1] > numOfFriends)
                continue;

            if(knowledgeableFriends.contains(meetingFriends[0]) || knowledgeableFriends.contains(meetingFriends[1])){
                if(!knowledgeableFriends.contains(meetingFriends[0]))
                    knowledgeableFriends.add(meetingFriends[0]);

                if(!knowledgeableFriends.contains(meetingFriends[1]))
                    knowledgeableFriends.add(meetingFriends[1]);
            }

            i++;
        }

        System.out.println(knowledgeableFriends.size());

    }

}
