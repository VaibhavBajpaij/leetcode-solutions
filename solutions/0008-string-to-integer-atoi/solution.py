class Solution:
    def myAtoi(self, s: str) -> int:
        i=0
        while(i<len(s) and s[i]==" "):
            i+=1
        s=s[i:]

        sign=1
        if not s:
            return 0
        if(s[0]=='-'):
            sign*=-1
            s=s[1:]
        elif(s[0]=='+'):
            s=s[1:]
            
        i=0
        while(i<len(s) and s[i]=="0"):
            i+=1
        ans=0
        s=s[i:]
        for val in s:
            if(val in "1234567890"):
                ans=ans*10 + int(val)
            else:
                break
        ans= ans*sign
        MIN_INT = -2**31
        MAX_INT = 2**31 - 1

        ans = max(MIN_INT, min(ans, MAX_INT))
        return ans

        

        
