class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        if len==1:
            return arr[0]
        i=0
        nums.sort()
        while(i<n-1):
            if(nums[i]==nums[i+1]):
                i=i+2
            else:
                return nums[i]
        return nums[i]

        
