class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxsum=float('-inf')
        sum=0
        for val in nums:
            sum+=val
            maxsum=max(maxsum,sum)
            if(sum<0):
                sum=0
        return maxsum
            
        
