class Solution:
    def minCostClimbingStairs(self, cost):
        next1 = 0   # dp[i+1]
        next2 = 0   # dp[i+2]

        for i in range(len(cost)-1, -1, -1):
            curr = cost[i] + min(next1, next2)

            next2 = next1
            next1 = curr

        return min(next1, next2)
