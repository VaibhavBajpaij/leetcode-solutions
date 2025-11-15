class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum=0
        sum=0
        mi=max(nums)
        if(len(nums)==1):
            return nums[0]
        for val in nums:
            sum=val+sum
            maxsum=max(maxsum,sum)
            if(sum<0):
                sum=0
        if maxsum==0:
            return mi
        else:
            return maxsum

        
