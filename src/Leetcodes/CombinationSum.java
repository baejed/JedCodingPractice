package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {7,11,13,17,19};
        int target = 67;
        System.out.println(combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> logger = new ArrayList<>();
        logger.add(1);
        getCombinations(logger, combinations, new ArrayList<>(), candidates, target);
        return combinations;
    }

    public static void getCombinations(List<Integer> logger, List<List<Integer>> combinations, List<Integer> currentCombination, int[] candidates, int target){
        if(getSum(currentCombination) > target) return;
        if(getSum(currentCombination) == target){
            if(!combinations.contains(currentCombination))combinations.add(currentCombination);
            return;
        }

        System.out.println(logger);
        logger.set(0, logger.get(0) + 1);

        for(int i = 0; i < candidates.length; i++){
            List<Integer> current = new ArrayList<>(currentCombination);
            insert(current, candidates[i]);
            getCombinations(logger, combinations, current, candidates, target);
        }
    }

    public static void insert(List<Integer> combination, int insertVal){
        if(combination.isEmpty()){
            combination.add(insertVal);
            return;
        }

        combination.add(insertVal);
        int i = combination.size() - 2;
        while(i >= 0 && combination.get(i) > insertVal){
            combination.set(i + 1, combination.get(i));
            i--;
        }

        combination.set(i + 1, insertVal);
    }

    public static int getSum(List<Integer> list){
        int sum = 0;

        for(int i : list){
            sum += i;
        }

        return sum;
    }
}
