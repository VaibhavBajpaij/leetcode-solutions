class Solution:
    
    def findLongestChain(self, pairs: List[List[int]]) -> int:
        n=len(pairs)
        dp=[1]*n
        pairs.sort()

        for i in range(n):
            for j in range(i+1):
                if(pairs[j][1]<pairs[i][0]):
                    dp[i]=max(dp[i],dp[j]+1)
        print(dp)
        return max(dp)


        
