class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; ) {
            int correctIdx = nums[i] - 1; // Correct index for the number
            if (nums[i] != nums[correctIdx]) { // Swap if not in the right place
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }

        // Step 2: Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) { // If number is not in the correct position
                ans.add(i + 1); // Missing number
            }
        }

        return ans;
    }

    // Helper function to swap two elements
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
