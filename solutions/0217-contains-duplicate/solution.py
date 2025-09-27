class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s=set()
        for val in nums:
            s.add(val)
        if(len(nums)>len(s)):
            return True
        else:
            return False
        

        
