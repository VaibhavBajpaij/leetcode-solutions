class Solution:
    def minFallingPathSum(self, matrix):
        n = len(matrix)

        dp = [[0] * n for _ in range(n)]

        # Base case
        for j in range(n):
            dp[n-1][j] = matrix[n-1][j]

        # Fill from bottom to top
        for i in range(n-2, -1, -1):
            for j in range(n):

                down = dp[i+1][j]

                left_diag = float('inf')
                if j > 0:
                    left_diag = dp[i+1][j-1]

                right_diag = float('inf')
                if j < n-1:
                    right_diag = dp[i+1][j+1]

                dp[i][j] = matrix[i][j] + min(
                    down,
                    left_diag,
                    right_diag
                )

        return min(dp[0])
