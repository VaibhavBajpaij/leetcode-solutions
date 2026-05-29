class Solution:

    def dfs(self,node,board,visited,x,y):

        direction=[[0,1],[0,-1],[-1,0],[1,0]]
        
        
        n=len(board)
        m=len(board[0])
        visited[x][y]=1




        for dx,dy in direction:
            nx=x+dx
            ny=y+dy
            if(nx>=0 and ny>=0 and m>ny and n>nx and visited[nx][ny]==0 and board[nx][ny]=="O"):
                self.dfs(board[nx][ny],board,visited,nx,ny)


        

    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        n=len(board)
        m=len(board[0])

        visted=[[0]*m for i in range(n)]

        # top and bottom
        for i in range(m):
            

            if(board[0][i]=="O" and visted[0][i] ==0):
                self.dfs(board[0][i],board,visted,0,i)
            if(board[n-1][i]=="O" and visted[n-1][i]==0):
                
                self.dfs(board[n-1][i],board,visted,n-1,i)

        for i in range(n):
            if(board[i][0]=="O" and visted[i][0] ==0):
                self.dfs(board[i][0],board,visted,i,0)
            if(board[i][m-1]=="O" and visted[i][m-1]==0):
                self.dfs(board[i][m-1],board,visted,i,m-1)

        for i in range(n):
            for j in range(m):
                if(board[i][j]=="O" and visted[i][j]==0):
                    board[i][j]="X"


        
