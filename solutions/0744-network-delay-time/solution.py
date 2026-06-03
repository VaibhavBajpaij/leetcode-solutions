import heapq
class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:

        graph=[[] for _ in range(n+1)]
        for u,v,w in times:
            graph[u].append([v,w])
        
        q=[]
        heapq.heappush(q,[k,0])

        m=sys.maxsize
        dist=[m]*(n+1)
        dist[k]=0

        while q:
            node,wa=heapq.heappop(q)

            for v,w in graph[node]:
                if(w+wa<dist[v]):
                    dist[v]=w+wa
                    heapq.heappush(q,[v,wa+w])
        ans = max(dist[1:])
        return -1 if ans == m else ans
        
