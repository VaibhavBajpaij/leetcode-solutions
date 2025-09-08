class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
    # tanspose of matrix swap a[i][j] with [j][i]
        n1=len(matrix)
        n2=len(matrix[0])
        for i in range(0,n1):
            for j in range(i,n1):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        
        for i in range(0,n1):
            k=0;
            l=n1-1;
            while(k<l):
                matrix[i][k],matrix[i][l]=matrix[i][l],matrix[i][k]
                k+=1
                l-=1
        

               
        
