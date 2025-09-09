class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        s=s.strip()
        sign=1
        i=0
        if not s :
            return 0
        if(s[0]=='-'):
            sign=-1
            i+=1
        elif(s[0]=='+'):
            sign=+1
            i+=1
        ans=0
        while( i<len(s) and s[i].isdigit()):
            ans=ans*10+int(s[i])
            i+=1
        intmax=2**31-1
        intmin=-2**31
        ans=sign*ans
        if(ans>intmax):
            return intmax
        elif(ans<intmin):
            return intmin
        else:
            return ans

             
