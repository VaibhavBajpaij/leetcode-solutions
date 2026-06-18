class Solution:
    def helper(self,grid,m,n,i,j,dp):
        if(m-1==i and n-1==j):
            return grid[i][j]
        if(dp[i][j]!=-1):
            return dp[i][j]
        if(m-1==i):
            dp[i][j]= grid[i][j]+self.helper(grid,m,n,i,j+1,dp)
        elif(n-1==j):
            dp[i][j]= grid[i][j]+self.helper(grid,m,n,i+1,j,dp)
        else:
            dp[i][j]= grid[i][j]+min(self.helper(grid,m,n,i+1,j,dp),self.helper(grid,m,n,i,j+1,dp))
        return dp[i][j]
    def minPathSum(self, grid: List[List[int]]) -> int:
        m=len(grid)
        n=len(grid[0])
        dp=[[-1]*(n+1) for _ in range(m+1)]

        return self.helper(grid,m,n,0,0,dp)
        
