class Solution:
    def helper(self,nums,i,prev,dp):
        if(len(nums)==i):
            return 0
        if(dp[i][prev+1]!=-1):
            return dp[i][prev+1]
        l= self.helper(nums,i+1,prev,dp)
        if(prev==-1 or prev<len(nums) and  nums[prev]<nums[i]):
            l=max(l,1+self.helper(nums,i+1,i,dp))
        dp[i][prev+1]=l
        return dp[i][prev+1]
    def lengthOfLIS(self, nums: List[int]) -> int:
        n=len(nums)

        dp=[[0]*(n+1) for i in range(n+1)]

        for i in range(n-1,-1,-1):
            for prev in range(i,-2,-1):
                l= dp[i+1][prev+1]
                if(prev==-1 or prev<len(nums) and  nums[prev]<nums[i]):
                    l=max(l,1+dp[i+1][i+1])
                dp[i][prev+1]=l
        return dp[0][0]

        return self.helper(nums,0,-1,dp)
        
