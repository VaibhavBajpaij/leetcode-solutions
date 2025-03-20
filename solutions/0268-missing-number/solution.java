class Solution {
private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        
        // Place numbers at their correct indices
        while (i < n) {
            if (nums[i] < n && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]); // Swap only if the value is in range and not already in place
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return n; // If all numbers are in place, return 'n' as the missing number
    }
}
