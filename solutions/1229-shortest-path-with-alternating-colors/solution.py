from collections import deque

class Solution:
    def shortestAlternatingPaths(self, n, redEdges, blueEdges):

        red = [[] for _ in range(n)]
        blue = [[] for _ in range(n)]

        for a, b in redEdges:
            red[a].append(b)

        for a, b in blueEdges:
            blue[a].append(b)

        ans = [-1] * n
        ans[0] = 0

        visit = set()

        visit.add((0, 0))
        visit.add((0, 1))

        q = deque()

        q.append((0, 0, 0))  # node, dist, last_color=red
        q.append((0, 0, 1))  # node, dist, last_color=blue

        while q:

            node, dis, col = q.popleft()

            if col == 0:  # last was red, next must be blue

                for val in blue[node]:

                    if (val, 1) not in visit:

                        visit.add((val, 1))

                        if ans[val] == -1:
                            ans[val] = dis + 1

                        q.append((val, dis + 1, 1))

            else:  # last was blue, next must be red

                for val in red[node]:

                    if (val, 0) not in visit:

                        visit.add((val, 0))

                        if ans[val] == -1:
                            ans[val] = dis + 1

                        q.append((val, dis + 1, 0))

        return ans
