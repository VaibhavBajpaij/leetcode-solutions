class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        
        // Step 1: LIS ending at each index
        int[] dp1 = new int[n];
        for (int i = 0; i < n; i++) {
            dp1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + 1);
                }
            }
        }
        
        // Step 2: LDS starting at each index
        int[] dp2 = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            dp2[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }
        
        // Step 3: Find max mountain length
        int maxMountain = 0;
        for (int i = 0; i < n; i++) {
            if (dp1[i] > 1 && dp2[i] > 1) { // valid peak
                maxMountain = Math.max(maxMountain, dp1[i] + dp2[i] - 1);
            }
        }
        
        // Step 4: Result
        return n - maxMountain;
    }
}

