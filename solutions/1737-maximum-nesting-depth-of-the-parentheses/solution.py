class Solution(object):
    def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        m=0
        c=0
        for i in s:
            if(i=='('):
                c+=1
            if(i==')'):
                c-=1
            m=max(c,m)
        return m
        
