class Solution:

    def dfs(self,grid,x,y,visited):
        visited[x][y]=1
        direction=[[0,1],[0,-1],[1,0],[-1,0]]
        n=len(grid)
        m=len(grid[0])

        for dx,dy in direction:
            nx=x+dx
            ny=y+dy
            if(nx>=0 and ny>=0 and nx<n and ny<m and grid[nx][ny]==1 and visited[nx][ny]==0):
                self.dfs(grid,nx,ny,visited)
    def source(self,grid,visited):
        n=len(grid)
        m=len(grid[0])

        

        for i in range(n):
            if(grid[i][0]==1 and visited[i][0]==0):
                self.dfs(grid,i,0,visited)
            if(grid[i][m-1]==1 and visited[i][m-1]==0):
                self.dfs(grid,i,m-1,visited)
        for i in range(m):
            if(grid[0][i]==1 and visited[0][i]==0):
                self.dfs(grid,0,i,visited)
            if(grid[n-1][i]==1 and visited[n-1][i]==0):
                self.dfs(grid,n-1,i,visited)
    def numEnclaves(self, grid: List[List[int]]) -> int:
        n=len(grid)
        m=len(grid[0])
        visited=[[0]*m for i in range(n)]
        self.source(grid,visited)
        v=0
        l=0
       
        for i in range(n):
            for j in range(m):
                if(grid[i][j]==1):
                    l+=1
                if(visited[i][j]==1):
                    v+=1
        print(v)
        print(l)
        print(visited)
        return l-v


        
