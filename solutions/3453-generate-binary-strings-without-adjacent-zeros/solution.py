class Solution:
    def valids(self,n,i,ans,v):
        if(len(v)<=i):
            ans.append(''.join(v))
            return 
        self.valids(n,i+1,ans,v)
        v[i]="0"
        self.valids(n,i+2,ans,v)
        v[i]="1"
        
    def validStrings(self, n: int) -> List[str]:

        ans=[]
        v=["1"]*n
        self.valids(n,0,ans,v)
        return ans
        
