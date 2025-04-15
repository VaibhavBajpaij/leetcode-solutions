class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Minimize k using modulo
        k = k % n;

        // Step 1: Reverse the last k elements
        int i = n - k;
        int j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // Step 2: Reverse the first n-k elements
        i = 0;
        j = n - k - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // Step 3: Reverse the entire array
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
}

