class DJS:
    def __init__(self, n):
        self.parent = list(range(n))
        self.rank = [0] * n

    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]

    def union(self, a, b):
        pa = self.find(a)
        pb = self.find(b)

        if pa == pb:
            return

        if self.rank[pa] > self.rank[pb]:
            self.parent[pb] = pa
        elif self.rank[pb] > self.rank[pa]:
            self.parent[pa] = pb
        else:
            self.parent[pb] = pa
            self.rank[pa] += 1


class Solution:
    def removeStones(self, stones: List[List[int]]) -> int:
        mr = max(r for r, c in stones)
        mc = max(c for r, c in stones)

        n = mr + mc + 2
        dsu = DJS(n)

        nodes = set()

        for r, c in stones:
            col = c + mr + 1
            dsu.union(r, col)

            nodes.add(r)
            nodes.add(col)

        components = 0
        for node in nodes:
            if dsu.find(node) == node:
                components += 1

        return len(stones) - components
