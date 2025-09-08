class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        n=len(nums)
        x=0
        for i in range(1,len(nums)):
            x=i
            if(nums[i-1]>nums[i]):
                break

        if(x==len(nums)-1 and nums[n-2]<nums[n-1]):
             return True
        for i in range(1,len(nums)):
            if(nums[(x+i)%len(nums)-1]>nums[(x+i)%len(nums)]):
                return False
        return True
        
