class Solution:
    def dfs(self,grid,visited,x,y):
        q=deque()
        q.append((x,y))
        dimention=[[0,1],[0,-1],[1,0],[-1,0]]
        visited[x][y]=1
        n=len(grid)
        m=len(grid[0])


        while q:
            i,j=q.popleft()
            for dx,dy in dimention:
                nx=i+dx
                ny=j+dy
                if(nx>=0 and ny>=0 and nx<n and ny<m and visited[nx][ny]==0 and grid[nx][ny]=="1"):
                    visited[nx][ny]=1
                    q.append((nx,ny))


    def numIslands(self, grid: List[List[str]]) -> int:
        n=len(grid)
        m=len(grid[0])

        visited=[[0]*m for i in range(n)]
        ans=0

        for i in range(n):
            for j in range(m):
                if(grid[i][j]=="1" and visited[i][j]==0):
                    ans+=1
                    self.dfs(grid,visited,i,j)
        return ans
                    
        
