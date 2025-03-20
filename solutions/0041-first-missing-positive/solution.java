class Solution {
     public int firstMissingPositive(int[] nums) {

    //     HashSet<Integer> set = new HashSet<>();
    //     int n = nums.length;

    //     // Step 1: Add all elements to HashSet
    //     for (int i = 0; i < n; i++) {
    //         set.add(nums[i]);
    //     }

    //     // Step 2: Find the first missing positive number
    //     for (int i = 1; i <= n; i++) {
    //         if (!set.contains(i)) {
    //             return i; // Return the missing positive number
    //         }
    //     }

    //     // Step 3: If all numbers from 1 to n are present, return n + 1
    //     return n + 1;
    // 
//     1. Create a HashSet to store all numbers from the array.
// 2. Iterate through the array and add each number to the HashSet.
// 3. Loop from 1 to n:
//    - If a number is missing in the HashSet, return that number.
// 4. If all numbers from 1 to n exist, return n + 1
// this takes extra time









      

    int n = nums.length;
        int i = 0;

        // Step 1: Place numbers in their correct positions using Cyclic Sort
        while (i < n) {
            int ele = nums[i]; // Get current element
            
            // Ignore elements that are:
            // 1. Out of range (greater than n or non-positive)
            // 2. Already in their correct position (nums[ele - 1] == ele)
            // 3. Already at the correct index (ele == i + 1)
            if (ele > n || ele <= 0 || ele == nums[ele - 1] || ele == i + 1) {
                i++; // Move to the next element
            } else {
                swap(nums, ele - 1, i); // Swap current element to its correct index
            }
        }

        // Step 2: Identify the first missing positive number
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1; // Return the missing number
            }
        }

        // Step 3: If all elements are correctly placed, return `n + 1`
        return n + 1;
    }

    // Helper function to swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}




// 1. Define function `firstMissingPositive(nums)`: 
//     - Get the length `n` of the array.
//     - Initialize `i = 0`.

// 2. **Step 1: Arrange elements in correct positions using Cyclic Sort**
//     - While `i < n`:
//         - Get `ele = nums[i]` (current element).
//         - If `ele` is:
//             - Greater than `n` (out of range) OR
//             - Less than or equal to `0` (negative or zero) OR
//             - Already at its correct position (`ele == nums[ele - 1]`) OR
//             - In the correct place (`ele == i + 1`):
//                 - Move to the next index (`i++`).
//         - Else, swap `nums[i]` with `nums[ele - 1]` (place the element in its correct index).

// 3. **Step 2: Find the first missing positive number**
//     - Loop through the array:
//         - If `nums[j] != j + 1`, return `j + 1` (first missing number).
  
// 4. **Step 3: If no missing number is found, return `n + 1`**.

// 5. End function.

