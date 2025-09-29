class Solution(object):
    def largestSumAfterKNegations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums.sort()
        i=0
        ans=0
        while(i<len(nums) and  k>0 and nums[i]<0):
            nums[i]*=-1
            k-=1
            i+=1
        if(k%2==1):
            nums.sort()
            nums[0]*=-1
        for val in nums:
            ans=ans+val
        return ans
            
        
