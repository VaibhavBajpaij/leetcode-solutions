class Solution:
    def extend_from_center(self,s:str,i:int,j:int,dp):
        if(dp[i][j]!=-1):
            return dp[i][j]
        while(i>=0 and j<len(s) and s[i]==s[j]):
            i-=1
            j+=1
        dp[i][j]= s[i+1:j]
        return dp[i][j]

    
    def longestPalindrome(self, s: str) -> str:
        n=len(s)
        if(n<2):
            return s
       
        ans=""
        dp=[[-1]*(n+1) for i in range(n+1)]

        for i in range(len(s)):

            odd=self.extend_from_center(s,i,i,dp)
            even=self.extend_from_center(s,i,i+1,dp)

            longer=even if(len(even)>len(odd)) else odd

            if(len(ans)<len(longer)):
                ans=longer

        
       
        return ans


    


        
