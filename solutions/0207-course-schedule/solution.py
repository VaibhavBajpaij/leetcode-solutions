class Solution:
    def dfs(self,node,graph,visited,again):
        visited[node]=1
        again[node]=1

        for val in graph[node]:
            if(visited[val]==0):
                if(self.dfs(val,graph,visited,again)):
                    return True
            elif(again[val]==1):
                return True
        again[node]=0
        return False
            
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph=[[] for i in range(numCourses)]

        for a, b in prerequisites:
            graph[b].append(a)
        visited=[0]*numCourses
        again=[0]*numCourses

        for val in range(numCourses):

            if(visited[val]==0):
                if(self.dfs(val,graph,visited,again)):
                    return False

        return True
