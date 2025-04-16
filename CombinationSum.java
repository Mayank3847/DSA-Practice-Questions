// Find All Unique Combinations of Numbers That Sum to a Target

import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinations(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            if (candidates[i] > target) break; // no need to continue if the number exceeds the target

            current.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], i, current, result); // allow the same element to be reused
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 5};
        int target = 8;
        List<List<Integer>> result = combinationSum(candidates, target);

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
