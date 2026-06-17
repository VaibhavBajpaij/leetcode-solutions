class Solution:
    def numOfMinutes(self, n, headID, manager, informTime):

        adj = [[] for _ in range(n)]

        for emp in range(n):
            if manager[emp] != -1:
                adj[manager[emp]].append(emp)

        self.ans = 0

        def dfs(node, time):

            self.ans = max(self.ans, time)

            for child in adj[node]:
                dfs(child, time + informTime[node])

        dfs(headID, 0)

        return self.ans
