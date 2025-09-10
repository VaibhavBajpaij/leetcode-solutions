class Solution(object):
    def power(self,x,n):
        MOD = 10**9 + 7

        if(n==0):
            return 1
        half=self.power(x,n//2)
        half = (half * half) % MOD
        if n % 2 == 0:
            return half
        else:
            return (half * x) % MOD
    def countGoodNumbers(self, n):
        """
        :type n: int
        :rtype: int
        """
        MOD = 10**9 + 7
        if(n%2==0):
            return self.power(5,n//2)* self.power(4,n//2)%MOD
        else:
            return self.power(5,(n+1)//2 )*self.power(4,n//2)%MOD


        
