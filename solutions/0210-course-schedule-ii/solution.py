class Solution:
    def dfs(self,i,req,visited,again,stack):
        visited[i]=1
        again[i]=1

        for val in req[i]:
            if(visited[val]==0):
                if(self.dfs(val,req,visited,again,stack)):
                    return True
            elif(again[val]==1):
                return True
        again[i]=0
        stack.append(i)
        return False

    def iscyle(self,V,req,stack):
        visited=[0]*V
        again=[0]*V

        for i in range(V):
            if(visited[i]==0):
                if(self.dfs(i,req,visited,again,stack)):
                    return True
        return False
    
    def top(self,node,graph,visited,stack):

        visited[node]=1

        for val in graph[node]:
            if(visited[val]==0):
                visited[val]=1
                self.top(val,graph,visited,stack)
        stack.append(node)


    
                
            
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:

        graph=[[] for i in range(numCourses)]

        for a,b in prerequisites:
            graph[b].append(a)
        print(graph)

        visited=[0]*numCourses
        again=[0]*numCourses
        stack=[]
        #self.iscyle(numCourses,graph
        
        if (self.iscyle(numCourses,graph,stack)):
            return []
        # else:
        #     stack=[]
        #     for val in range(numCourses):
        #         if(visited[val]==0):
        #             self.top(val,graph,visited,stack)
            
        return stack[::-1]
        
        
