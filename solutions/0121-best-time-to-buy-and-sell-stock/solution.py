class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        m=0;
        i=0;
        j=0;
        n=len(prices)
        while(j<n):
            m=max(m,prices[j]-prices[i])
            if(prices[i]>prices[j]):
                i=j
            j+=1
            
        return m
        
