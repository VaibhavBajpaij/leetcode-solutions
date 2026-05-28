class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:

        n=len(grid)
        m=len(grid[0])

        q=deque()
        fresh=0
        

        for i in range(n):
            for j in range(m):
                if(grid[i][j]==2):
                    q.append((i,j,0))
                elif(grid[i][j]==1):
                    fresh+=1
        
        direction=[[0,1],[0,-1],[1,0],[-1,0]]
        time=0
        while(q):
            x,y,t=q.popleft()
            time=max(time,t)

            for xd,yd in direction:
                nx=x+xd
                ny=y+yd

                if(nx>=0 and ny>=0 and nx<n and ny<m and grid[nx][ny]==1):
                    grid[nx][ny]=2
                    q.append((nx,ny,t+1))
                    fresh-=1
        if(fresh>0):
            return -1
        return time


                

        
