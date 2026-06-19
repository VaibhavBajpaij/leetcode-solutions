class Solution:

    def helper(self, grid, m, n, i, j,dp):

        # out of bounds
        if i >= m or j >= n:
            return 0

        # obstacle
        if grid[i][j] == 1:
            return 0

        # destination
        if i == m-1 and j == n-1:
            return 1
        if(dp[i][j]!=-1):
            return dp[i][j]

        down = self.helper(grid, m, n, i+1, j,dp)
        right = self.helper(grid, m, n, i, j+1,dp)

        dp[i][j]= down + right
        return dp[i][j]

    def uniquePathsWithObstacles(self, obstacleGrid):

        m = len(obstacleGrid)
        n = len(obstacleGrid[0])
        dp=[[-1]*n for _ in range(m)]

        return self.helper(obstacleGrid, m, n, 0, 0,dp)
