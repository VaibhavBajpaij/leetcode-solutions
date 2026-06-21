class Solution:
    def helper(self,s,i,j,dp):

        if i > j:
            return 0

        if i == j:
            return 1

        if dp[i][j] != -1:
            return dp[i][j]

        if s[i] == s[j]:
            dp[i][j] = 2 + self.helper(s,i+1,j-1,dp)
        else:
            dp[i][j] = max(
                self.helper(s,i+1,j,dp),
                self.helper(s,i,j-1,dp)
            )

        return dp[i][j]

    def longestPalindromeSubseq(self, s: str) -> int:

        n=len(s)
        dp=[[-1]*n for _ in range(n)]

        return self.helper(s,0,n-1,dp)
