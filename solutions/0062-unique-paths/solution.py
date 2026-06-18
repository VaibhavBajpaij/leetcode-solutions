class Solution:
    def helper(self,m,n,i,j,dp):
        if(i>=m-1 and j>=n-1):
            return 1
        if(dp[i][j]!=-1):
            return dp[i][j]
        if(i==m-1):
            dp[i][j] =self.helper(m,n,i,j+1,dp)
        elif(j==n-1):
            dp[i][j]= self.helper(m,n,i+1,j,dp)
        else:
            dp[i][j]= self.helper(m,n,i,j+1,dp)+self.helper(m,n,i+1,j,dp)
        return dp[i][j]
    def uniquePaths(self, m: int, n: int) -> int:
        
        dp=[[-1]*n for _ in range(m)]
        return self.helper(m,n,0,0,dp)
        
