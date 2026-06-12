class Solution:
    def __init__(self):
        self.time=1
    def dfs(self,node,parent,adj,visit,low,time,ans):
        visit[node]=1
        time[node]=low[node]=self.time
        self.time+=1

        for v in adj[node]:
            if(v==parent):
                continue
            if(visit[v]==0):
                self.dfs(v,node,adj,visit,low,time,ans)
                low[node]=min(low[node],low[v])

                if(low[v]>time[node]):
                    ans.append([v,node])
            else:
                low[node]=min(low[node],low[v])


    def criticalConnections(self, n: int, connections: List[List[int]]) -> List[List[int]]:

        adj=[[] for i in range(n)]

        for v,u in connections:
            adj[v].append(u)
            adj[u].append(v)

        vist=[0]*n
        low=[0]*n
        time=[0]*n
        ans=[]

        self.dfs(0,-1,adj,vist,low,time,ans)

        return ans
            

        
