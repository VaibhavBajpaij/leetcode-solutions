class Solution:
    def helper(self, triangle, n, i, j, dp):

        if i == n - 1:
            return triangle[i][j]

        if dp[i][j] != -1:
            return dp[i][j]

        left = triangle[i+1][j] + self.helper(triangle, n, i + 1, j, dp)

        right = triangle[i+1][j+1] + self.helper(triangle, n, i + 1, j + 1, dp)

        dp[i][j] = min(left, right)

        return dp[i][j]

    def minimumTotal(self, triangle):
        n = len(triangle)

        dp = [[0] * (i + 1) for i in range(n)]

        for j in range(n):
            dp[n-1][j]=triangle[n-1][j]
        print(dp)
        

        for i in range(n-2,-1,-1):
            for j in range(i+1):
                dp[i][j]=triangle[i][j]+min(dp[i+1][j],dp[i+1][j+1])
        print(dp)
        return dp[0][0]
