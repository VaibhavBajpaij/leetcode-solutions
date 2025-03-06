import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        subsetHelp(0, nums, li, ans);
        return ans;
    }

    private static void subsetHelp(int i, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        // Correct base condition
        if (i == nums.length) {
            ans.add(new ArrayList<>(list)); // Add a copy of the list
            return;
        }

        int a = nums[i];

        // Include 'a' in the subset
        list.add(a);
        subsetHelp(i + 1, nums, list, ans);
        
        // Remove 'a' (Backtracking)
        list.remove(list.size() - 1);

        // Exclude 'a' and move to the next index
        subsetHelp(i + 1, nums, list, ans);
    }
}

