class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:

        graph=[[] for _ in range(n)]
        for x,y,w in flights:
            graph[x].append([y,w])
        
        m=sys.maxsize
        dist=[m]*n
        dist[src]=0

        q=deque()
        q.append([0,0,src])
        
        while(q):
            stop,cost,node=q.popleft()
            if(k<stop):
                continue
            for no,w in graph[node]:

                if(w+cost<dist[no] and stop<=k):
                    dist[no]=w+cost
                    q.append((stop+1,w+cost,no))
        print(dist)
        if(dist[dst]==m):
            return -1
        return dist[dst]

        
