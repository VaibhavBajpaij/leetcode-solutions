class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        ls=list(s)
        ls.sort()
        ts=list(t)
        ts.sort()
        print(ls)
        print(ts)
        
        if(ls==ts):
            return True
        else:
            return False


        
        
