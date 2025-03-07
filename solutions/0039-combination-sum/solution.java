import java.util.*;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        help(candidates, target, ans, list, 0);
        return ans;
    }

    private void help(int[] arr, int target, List<List<Integer>> ans1, List<Integer> list, int index) {
        // If target becomes 0, we found a valid combination
        if (target == 0) {
            ans1.add(new ArrayList<>(list)); // Store a new copy of list
            return;
        }

        // If index is out of bounds or target becomes negative, return
        if (index >= arr.length || target < 0) {
            return;
        }

        // Include current element in the subset
        list.add(arr[index]);
        help(arr, target - arr[index], ans1, list, index); // Not index+1 because we can reuse the same element
        list.remove(list.size() - 1); // Backtrack

        // Exclude current element and move to next index
        help(arr, target, ans1, list, index + 1);
    }
}

