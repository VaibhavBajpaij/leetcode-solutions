class Solution {
    // Helper function to swap two elements in an array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length; // Get the size of the array
        int i = 0;

        // Step 1: Place numbers in their correct positions using cyclic sort
        while (i < n) {
            // If nums[i] is within range and not already in its correct place
            if (nums[i] < n && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]); // Swap nums[i] with its correct index
            } else {
                i++; // Move to the next index
            }
        }

        // Step 2: Find the missing number by checking which index does not match its value
        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j; // Found the missing number
            }
        }

        // If no number is missing within range, return `n` (edge case)
        return n;
    }
}


// 1. Define a function `missingNumber(nums)`:
//     - Get the length of the array `n`
//     - Initialize index `i = 0`

// 2. **Step 1: Place numbers in their correct positions**
//     - While `i < n`:
//         - If `nums[i] < n` and `nums[i] != nums[nums[i]]`:
//             - Swap `nums[i]` with `nums[nums[i]]` to place the number at its correct index.
//         - Else, increment `i` (move to the next element).

// 3. **Step 2: Find the missing number**
//     - Loop through the array:
//         - If `nums[j] != j`, return `j` (this index is missing).
    
// 4. If all numbers are in place, return `n` (the last number is missing).

// 5. End function.

