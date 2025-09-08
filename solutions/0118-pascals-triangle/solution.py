class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        l=[]
        for i in range(numRows):
            l1=[]
            value=1
            for j in  range(i+1):
                l1.append(value)
                value=value*(i-j)//(j+1)
            l.append(l1)
        return l
            

        
