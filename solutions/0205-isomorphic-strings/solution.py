class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d={}
        di={}
        n1=len(s)
        n2=len(t)
        if(n2!=n1):
            return False
        for i in range(n1):
            c1=s[i]
            c2=t[i]
            if c1 in d:
                if(d[c1]!=c2):
                    return False
            else:
                d[c1]=c2
            if c2 in di:
                if(di[c2]!=c1):
                    return False
            else:
                di[c2]=c1
        return True

        
