class Solution:
    def gen(self,n,i,temp,ans,l,r):
        if(2*n==len(temp)):
            ans.append(''.join(temp))
        
        if(l<n):
            temp.append('(')
            self.gen(n,i+1,temp,ans,l+1,r)
            temp.pop()
        if(l>r):
            temp.append(")")
            self.gen(n,i+1,temp,ans,l,r+1)
            temp.pop()
        

    def generateParenthesis(self, n: int) -> List[str]:

        ans=[]
        temp=[]
        self.gen(n,0,temp,ans,0,0)
        return ans
        
