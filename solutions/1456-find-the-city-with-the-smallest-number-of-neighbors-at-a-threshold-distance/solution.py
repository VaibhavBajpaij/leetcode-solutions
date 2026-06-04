class Solution:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        inf=10**8
        graph=[[inf]*n for _ in range(n)]
        for i in range(n):
            graph[i][i]=0
        for v,u,w in edges:
            graph[v][u]=w
            graph[u][v]=w

        for vai in range(n):
            for i in range(n):
                for j in range(n):
                    if(graph[i][vai]!=inf and graph[vai][i]!=inf):
                        graph[i][j]=min(graph[i][j],graph[vai][j]+graph[i][vai])

        ans=0
        cont=inf
        for i in range(n):
            ct=-1
            for j in range(n):
                if(graph[i][j]<=distanceThreshold):
                    ct+=1
            if(ct<=cont):
                ans=i
                cont=ct
        return ans


