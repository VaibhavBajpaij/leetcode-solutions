class Solution(object):
    def helper(self,n,l,r,s,li):
        if n==l and n==r:
            li.append(s)
            return 
        if(l<n and l>=r):
            self.helper(n,l+1,r,s+'(',li)
        if(r<n and l>r):
            self.helper(n,l,r+1,s+')',li)


    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        l=[]
        self.helper(n,0,0,'',l)
        return l
        
