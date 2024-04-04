package CompetitiveProgramming;

import java.util.*;

public class GemIsland {

    //unfinished, wa ko kabalo unsa nga arrays ang gamiton3

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        List<Integer> stats = new ArrayList<>();
        List<Integer> inhabitantGems = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int n;
        int d;
        int r;


        System.out.print("Enter three numbers separated by spaces: ");

        n = Integer.parseInt(scanf.next());
        d = Integer.parseInt(scanf.next());
        r = Integer.parseInt(scanf.next());

        for(int i = 0; i < n; i++){
            inhabitantGems.add(1);
        }

        compute(stats, set, d, r, 0, inhabitantGems, 0);

        System.out.println(stats);
        System.out.println("Size: " + stats.size());
        System.out.printf("%.7f", getTotal(stats)/((double)(stats.size())));

    }

    public static void compute(List<Integer> stats, HashSet<List<Integer>> set, int d, int r, int currentDay, List<Integer> inhabitantGems, int inhabitantIndex){
        int numOfInhabitants = inhabitantGems.size();
//        Collections.sort(inhabitantGems);
        if(currentDay == d){
//            if(!set.add(inhabitantGems)) return;
            int sumOfTopValues = getGreatestValues(r, inhabitantGems);
            stats.add(sumOfTopValues);
            return;
        }
        inhabitantGems.set(inhabitantIndex, inhabitantGems.get(inhabitantIndex) + 1);
        for(int i = 0; i < numOfInhabitants; i++){
            List<Integer> inhabitantGemsCopy = new ArrayList<>(inhabitantGems);
            compute(stats, set, d, r, currentDay + 1, inhabitantGemsCopy, i);
        }
    }

    public static int getGreatestValues(int numOfGreatVales, List<Integer> list){
        List<Integer> listCopy = new ArrayList<>(list);
        Collections.sort(listCopy);
        int sum = 0;
        for(int i = listCopy.size() - 1; i >= listCopy.size() - numOfGreatVales; i--){
            sum += listCopy.get(i);
        }
        return sum;
    }

    public static int getTotal(List<Integer> list){
        int total = 0;
        for(int num : list){
            total += num;
        }
        return total;
    }

}
