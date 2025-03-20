class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int correctIndex = nums[i] - 1; // Correct position of nums[i]

            // If already in correct position or duplicate is found
            if (nums[i] == nums[correctIndex]) {
                if (i != correctIndex) return nums[i]; // Duplicate found
                else i++; // Move forward if it's in the right place
            } 
            // Swap if not in the correct place
            else {
                swap(nums, i, correctIndex);
            }
        }
        return -1; // Should never reach here
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

