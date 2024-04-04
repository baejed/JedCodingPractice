package Leetcodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        int[] candidates = {1,1,1,1,1,1,1,11,1,1,1,11,1,1,1,1,1};
        int target = 30;
        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> candidatesList = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        copyArr(candidatesList, candidates);
        getCombinations(combinations, new ArrayList<>(), candidatesList, target);


        return combinations;
    }

    public static void getCombinations(List<List<Integer>> combinations, List<Integer> combination, List<Integer> candidates, int target){
        if(getSum(combination) > target) return;

        if(getSum(combination) == target){
            if(!combinations.contains(combination))combinations.add(combination);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < candidates.size(); i++){
            if(set.contains(candidates.get(i))) continue;
            List<Integer> currentCandidates = new ArrayList<>(candidates);
            List<Integer> currentCombination = new ArrayList<>(combination);
            set.add(candidates.get(i));
            insert(currentCombination, candidates.get(i));
            currentCandidates.remove(i);
            getCombinations(combinations, currentCombination, currentCandidates, target);
        }
    }

    public static int getSum(List<Integer> list){
        int sum = 0;

        for(int i : list){
            sum += i;
        }

        return sum;
    }

    public static void copyArr(List<Integer> list, int[] arr){
        for(int i : arr){
            list.add(i);
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

}
