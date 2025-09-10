class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if n < 0:
            x = 1 / x
            n = -n
       
        if n==0:
            return 1

        helf =  self.myPow(x,n//2)
        if n%2==0:
            return helf * helf
        else:
            return helf * helf * x
