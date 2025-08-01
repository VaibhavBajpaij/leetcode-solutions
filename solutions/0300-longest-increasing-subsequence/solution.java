class Solution {
    public int lengthOfLIS(int[] nums) {
       
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, Math.abs(num));
        }

        // Create DP array: size is [n][2 * max + 2] to handle negatives safely
        int[][] dp = new int[nums.length][2 * max + 2];

        // Initialize the DP table with -1
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        
        return lengthL(nums, 0, Integer.MIN_VALUE, dp, max);
    }

    public int lengthL(int[] nums, int i, int k, int[][] dp, int max) {
      
        if (i == nums.length) return 0;

        
        if (k != Integer.MIN_VALUE && dp[i][k + max] != -1) {
            return dp[i][k + max];
        }

        int take = 0;

        
        if (k < nums[i]) {
            take = 1 + lengthL(nums, i + 1, nums[i], dp, max);
        }

       
        int notTake = lengthL(nums, i + 1, k, dp, max);

        int ans = Math.max(take, notTake);

      
        if (k != Integer.MIN_VALUE) {
            dp[i][k + max] = ans;
        }

        return ans;
    }
}

