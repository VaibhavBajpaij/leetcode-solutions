class Solution:
    def fib(self, n: int) -> int:
        if(n==0):
            return 0
        if(n==1):
            return 1
        if(n==2):
            return 1
        prev1=1
        prev2=1
        for i in range(3,n+1):
            curr=prev1+prev2
            prev2=prev1
            prev1=curr
            
        return prev1
