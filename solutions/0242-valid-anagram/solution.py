class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        n1=len(s)
        n2=len(t)
        if(n1!=n2):
            return False

        d={}

        for i in s:
            if i not in t:
                return False
            d[i]=d.get(i,0)+1
        for i in t:
            if i not in d:
                return False
            if d[i]==1:
                d.pop(i)
            else:
                d[i]-=1
        return True

        
