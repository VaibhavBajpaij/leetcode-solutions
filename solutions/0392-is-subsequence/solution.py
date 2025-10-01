class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s)==0):
            return True
        i=0
        for val in t:
            if(i==len(s)-1 and val==s[i]):
                return True
            elif(val==s[i]):
                i+=1
        return False

        
