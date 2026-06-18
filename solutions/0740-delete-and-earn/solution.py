class Solution:
    def helper(self,cost,i,n,dp):
        if(n<=i):
            return 0
        if(dp[i]!=-1):
            return dp[i]
        left=cost[i]+self.helper(cost,i+2,n,dp)
        right=self.helper(cost,i+1,n,dp)
        dp[i]= max(left,right)
        return dp[i]

    def deleteAndEarn(self, nums: List[int]) -> int:
        n=max(nums)
        frq=[0]*(n+1)
       
        for val in nums:
            frq[val]+=val
        
        
        i1=0
        i2=0

        for i in range(len(frq)-1,-1,-1):
            curr=max(frq[i]+i2,i1)
            i2=i1
            i1=curr
        return i1
        


        
