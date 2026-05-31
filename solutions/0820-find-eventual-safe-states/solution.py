class Solution:
    def dfs(self,node,graph,visited,after,safe):
        visited[node]=1
        after[node]=1
        safe[node]=0

        for val in graph[node]:
            if(visited[val]==0):
                if(self.dfs(val,graph,visited,after,safe)):
                    return True
            if(after[val]==1):
                return True
        after[node]=0
        safe[node]=1
        return False
    def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:

        V=len(graph)
        visited=[0]*V
        after=[0]*V
        safe=[0]*V
        
        for val in range(V):
            if(visited[val]==0):
                self.dfs(val,graph,visited,after,safe)
        
        ans=[]
        print(safe)
        for val in range(len(safe)):
            if(safe[val]==1):
                ans.append(val)
        return ans

        
