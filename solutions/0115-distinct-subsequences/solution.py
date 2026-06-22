class Solution:
    def helper(self,s,t,i,j,dp):

        if j == len(t):
            return 1

        if i == len(s):
            return 0

        if dp[i][j] != -1:
            return dp[i][j]

        if s[i] == t[j]:
            dp[i][j] = (
                self.helper(s,t,i+1,j+1,dp)
                + self.helper(s,t,i+1,j,dp)
            )
        else:
            dp[i][j] = self.helper(s,t,i+1,j,dp)

        return dp[i][j]

    def numDistinct(self, s: str, t: str) -> int:

        dp=[[-1]*len(t) for _ in range(len(s))

        ]

        return self.helper(s,t,0,0,dp)
