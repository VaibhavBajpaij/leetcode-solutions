class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        st=s.strip()
        c=0
        for i in range(len(st)-1,-1,-1):
            if(st[i]==" "):
                break
            c+=1
        return c
        
