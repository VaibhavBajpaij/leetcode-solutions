class DJU:
    def __init__(self,n):
        self.parent=list(range(n))
        self.rank=[0]*n
        self.size=[1]*n

    def find(self, i):
        if self.parent[i] != i:
            self.parent[i] = self.find(self.parent[i])
        return self.parent[i]

    def union(self,v,u):
        s1=self.find(v)
        s2=self.find(u)
        if(s1!=s2):
            if(self.rank[s1]>self.rank[s2]):
                self.parent[s2]=s1
            elif(self.rank[s1]<self.rank[s2]):
                self.parent[s1]=s2
            else:
                self.parent[s1]=s2
                self.rank[s2]+=1
            
    def unionBySize(self, u, v):
        ulp_u = self.find(u)
        ulp_v = self.find(v)
        if ulp_u == ulp_v:
            return
        if self.size[ulp_u] < self.size[ulp_v]:
            self.parent[ulp_u] = ulp_v
            self.size[ulp_v] += self.size[ulp_u]
        else:
            self.parent[ulp_v] = ulp_u
            self.size[ulp_u] += self.size[ulp_v]
    
    def getSize(self, node):
        return self.size[self.find(node)]

            
class Solution:

    def intialIsland(self,grid,obj):
        n=len(grid)
        adj=[[0,-1],[0,1],[-1,0],[1,0]]
        for i in range(n):
            for j in range(n):
                if(grid[i][j]==0):
                    continue
                for x,y in adj:
                    nr=i+x
                    nc=j+y
                    if(nr>=0 and nc>=0 and nr<n and nc<n and grid[nr][nc]==1):
                        nodenum=i*n+j
                        adjnode=nr*n+nc
                        obj.unionBySize(nodenum,adjnode)
    def largestIsland(self, grid: List[List[int]]) -> int:

        n=len(grid)
        obj=DJU(n*n)
        

        adj=[[0,-1],[0,1],[-1,0],[1,0]]

        self.intialIsland(grid,obj)

        ans=0
        for i in range(n):
            for j in range(n):
                if(grid[i][j]==1): 
                    continue

                componet=set()
                for x,y in adj:
                    nr=i+x
                    nc=j+y
                    if(nr>=0 and nc>=0 and nr<n and nc<n and grid[nr][nc]==1):
                        nodenum=i*n+j
                        adjnode=nr*n+nc
                        componet.add(obj.find(adjnode))
                
                sizeTotal = 0
                
                # Iterate on all the neighboring ultimate parents
                for parent in componet:
                    # Update the size
                    sizeTotal += obj.getSize(parent)
                
                # Store the maximum size of island
                ans = max(ans, sizeTotal + 1)

        for cellNo in range(n * n):
            # Keep the answer updated
            ans = max(ans, obj.getSize(cellNo))
        
        # Return the answer
        return ans




        

                        
                    
        
