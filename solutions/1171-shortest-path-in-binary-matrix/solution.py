import sys
class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        n=len(grid)
        if grid[0][0] == 1 or grid[n-1][n-1] == 1:
            return -1
        if(n==1):
            return 1
        
        if(grid[0][0]==1):
            return -1

        q=deque()
        
        q.append((0,0,1))
        m=sys.maxsize
        dist=[[m]*n for i in range(n)]
        dist[0][0]=1
        dimention=[[0,1],[0,-1],[1,0],[-1,0],[-1,-1],[1,1],[-1,1],[1,-1]]

        while(q):
            x,y,w=q.popleft()

            for i,j in dimention:
                nx=x+i
                ny=y+j
                if(nx>=0 and ny>=0 and nx<n and ny<n and grid[nx][ny]==0 and w+1<dist[nx][ny]):
                    dist[nx][ny]=w+1

                    if(nx==n-1 and ny==n-1):
                        return w+1
                    q.append((nx,ny,w+1))
        
        return -1


        
