class Solution {

    // Function to rotate the array starting from index k
    private void rotateFromK(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Reverse the first part [0 to k]
        int i = 0, j = k;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // Step 2: Reverse the second part [k+1 to n-1]
        i = k + 1;
        j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // Step 3: Reverse the whole array [0 to n-1]
        i = 0;
        j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    // Function to find the index where the array breaks sorting
    private int findK(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1; // No rotation (fully sorted)
    }

    // Main function to check if array is sorted and rotated
    public boolean check(int[] nums) {
        int k = findK(nums); // Find the point of rotation

        if (k == -1) return true; // Already sorted

        rotateFromK(nums, k); // Rotate from the break point

        // Now check if the rotated array is sorted
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false; // Not sorted
            }
        }

        return true; // Sorted after rotation
    }
}

