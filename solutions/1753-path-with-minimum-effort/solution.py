import heapq
class Solution:
    def minimumEffortPath(self, heights: List[List[int]]) -> int:

        n=len(heights)
        m=len(heights[0])
        
        q=[]
        heapq.heappush(q,(0,0,0))
        ma=sys.maxsize
        dist=[[ma]*m for _ in range(n)]
        dist[0][0]=0

        direction=[[0,1],[0,-1],[1,0],[-1,0]]

        while(q):
            w,x,y=heapq.heappop(q)

            if(n-1==x and m-1==y):
                return w
            
            for i,j in direction:
                nx=x+i
                ny=y+j
                if(nx>=0 and ny>=0 and nx<n and ny<m):

                    efert=max(abs(heights[x][y]-heights[nx][ny]),w)
                    if(efert<dist[nx][ny]):
                        dist[nx][ny]=efert
                        heapq.heappush(q,(efert,nx,ny))
        return 0
        


        
