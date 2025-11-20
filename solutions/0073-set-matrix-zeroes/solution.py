class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m=len(matrix)
        n=len(matrix[0])
        
        ans=[]
        for i in range(m):
            a=[]
            for j in range(n):
                a.append(matrix[i][j])
            ans.append(a)


        for i in range(m):
            for j in range(n):
                val=matrix[i][j]
                if(val==0):
                    for k in range(m):
                        ans[k][j]=0
                    for k in range(n):
                        ans[i][k]=0
        for i in range(m):
            for j in range(n):
                matrix[i][j] = ans[i][j]
    
        
