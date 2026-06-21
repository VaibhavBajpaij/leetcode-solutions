class Solution:
    # def helper(self,s1,s2,i,j,dp):
    #     if(len(s1)==i):

    #         sum=0
    #         for m in range(j,len(s2)):
    #             sum+=ord(s2[m])
    #         return sum
    #     if(len(s2)==j):

    #         sum=0
    #         for m in range(i,len(s1)):
    #             sum+=ord(s1[m])
    #         return sum
        
    #     if(dp[i][j]!=-1):
    #         return dp[i][j]
        
    #     if(s1[i]==s2[j]):
    #         return self.helper(s1,s2,i+1,j+1,dp)
    #     left=ord(s1[i])+self.helper(s1,s2,i+1,j,dp)
    #     right=ord(s2[j])+self.helper(s1,s2,i,j+1,dp)
    #     dp[i][j]= min(left,right)
    #     return dp[i][j]
    def minimumDeleteSum(self, s1: str, s2: str) -> int:


        n=len(s1)
        m=len(s2)
        dp=[[0]*(m+1) for i in range(n+1)]
        
        for i in range(m+1):
            sum=0
            for x in range(i,len(s2)):
                sum+=ord(s2[x])
            dp[n][i]=sum
        for j in range(n+1):
            sum=0
            for x in range(j,len(s1)):
                sum+=ord(s1[x])
            dp[j][m]=sum
        for i in range(n-1,-1,-1):
            for j in range(m-1,-1,-1):
                if(s1[i]==s2[j]):
                    dp[i][j]=dp[i+1][j+1]
                else:
                    left=ord(s1[i])+dp[i+1][j]
                    right=ord(s2[j])+dp[i][j+1]
                    dp[i][j]=min(left,right)
        return dp[0][0]


