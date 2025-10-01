class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        x=""
        for val in s:
            if val.isalnum():
                x+=val.lower()
        i=0
        j=len(x)-1
        while(i<j):
            if(x[i]!=x[j]):
                return False
            i+=1
            j-=1
        return True
        
        
