// Correct brute-force approach for subarray sum equals k
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        // Try all subarrays starting from i
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j]; // expanding the subarray

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}

