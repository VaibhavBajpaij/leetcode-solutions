class Solution:
    def helper(self,nums,i,n,temp,dp):
        if(i>=n):
            return 0
        if(dp[i]!=-1):
            return dp[i]
        left=nums[i]+self.helper(nums,i+2,n,temp,dp)
        right=self.helper(nums,i+1,n,temp,dp)
        dp[i]= max(left,right)
        return dp[i]
        
    def rob(self, nums: List[int]) -> int:

        n=len(nums)
        dp=[-1]*(n+1)
        return self.helper(nums,0,n,0,dp) 
        
        

                                       
