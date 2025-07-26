class Solution {
    public long longest(List<Integer> nums, int target, int i,long [][] dp) {
       
        if (i == nums.size()) {
            return (target == 0) ? 0 : Long.MIN_VALUE;
        }

       if(dp[i][target]!=-1) return dp[i][target];

        long skip = longest(nums, target, i + 1,dp);

        
        long take = Long.MIN_VALUE;
        if (target - nums.get(i) >= 0) {
            long temp = longest(nums, target - nums.get(i), i + 1,dp);
            if (temp != Long.MIN_VALUE) {
                take = 1 + temp; 
            }
        }

        // Return the max of both choices
        return dp[i][target] = Math.max(skip, take);
    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

         long [][] dp=new long [nums.size()][target+1];
        for(int i=0;i<nums.size();i++){
            Arrays.fill(dp[i],-1);
        }
        long ans = longest(nums, target, 0,dp);

       
        return (ans == Long.MIN_VALUE) ? -1 : (int) ans;
    }
}

