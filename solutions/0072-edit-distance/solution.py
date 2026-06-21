class Solution:
    def helper (self,word1,word2,i,j,dp):
        if(i==len(word1)):
            return len(word2)-j
        if(j==len(word2)):
            return len(word1)-i
        
        if(dp[i][j]!=-1):
            return dp[i][j]
       
        if(word1[i]==word2[j]):
            return self.helper(word1,word2,i+1,j+1,dp)
        insert=1+self.helper(word1,word2,i,j+1,dp)
        delete=1+self.helper(word1,word2,i+1,j,dp)
        replace=1+self.helper(word1,word2,i+1,j+1,dp)
        dp[i][j]= min(insert,min(delete,replace))
        return dp[i][j]
        
            

    def minDistance(self, word1: str, word2: str) -> int:

        n=len(word1)
        m=len(word2)
        dp=[[-1]*(m) for i in range(n)]
        
        return self.helper(word1,word2,0,0,dp)
        
