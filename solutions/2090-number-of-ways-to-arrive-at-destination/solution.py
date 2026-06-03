class Solution:
    def countPaths(self, n: int, roads: List[List[int]]) -> int:
        graph=[[] for _ in range(n)]
        
        for u,v,t in roads:
            graph[u].append([v,t])
            graph[v].append([u,t])
        
        m=sys.maxsize
        dist=[m]*n
        dist[0]=0
        way=[0]*n
        way[0]=1
        


        mod=10**9 +7
        q=[]
        heapq.heappush(q,[0,0])

        while q:
            w,node=heapq.heappop(q)

            for u,t in graph[node]:
                if(dist[u]>t+w):
                    dist[u]=t+w
                    way[u]=way[node]
                    heapq.heappush(q,[t+w,u])
                elif(dist[u]==t+w):
                    way[u]=(way[node]+way[u])
        print(way)
        print(dist)
        return way[n-1]%mod


        
