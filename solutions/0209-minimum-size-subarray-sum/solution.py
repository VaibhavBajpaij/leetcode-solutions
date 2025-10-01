class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        x=sys.maxsize
        start=0
        sum=0
        for i in range(len(nums)):
            sum=sum+nums[i]
            while(sum>=target):
                x=min(x,i-start+1)
                sum=sum-nums[start]
                start+=1
        if x==sys.maxsize :
            return 0
        return x

        
