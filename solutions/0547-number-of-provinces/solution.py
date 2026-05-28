class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n=len(isConnected)

        graph={}

        for i in range(n):
            graph[i] = []
            for j in range(n):
                if(isConnected[i][j]==1 and i!=j):
                    graph[i].append(j)
        print(graph)
            
        
        #dfs
        visted=set()
        def dfs(node):
            visted.add(node)

            for n in graph[node]: 
                if(n not in visted):
                    dfs(n)
        
        #ans
        province=0
        for i in range(n):
            if(i not in  visted):
                dfs(i)
                province+=1
        return province



