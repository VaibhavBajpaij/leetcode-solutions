class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:

        n=len(s)
        m=len(wordDict)
        dp=[False]*(n+1)
        dp[0]=True
        ma=0
        for val in wordDict:
            ma=max(ma,len(val))
        map=set(wordDict)

        for i in range(n):
            val=i-ma
            if(val<0):
                val=-1
            for j in range(i,val,-1):
                sub=s[j:i+1]
                if(sub in map):
                    if(dp[j]==True):
                        dp[i+1]=True
        return dp[n]




