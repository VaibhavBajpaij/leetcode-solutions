class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m=0
        i=0
        j=0
        n=len(nums)
        while j<n:
            if(nums[j]==1 and nums[i]==1):
                j+=1
            elif(nums[i]==1 and nums[j]==0):
                m=max(m,j-i)
                j+=1
                i=j
            elif(nums[i]==0 and nums[j]==0):
                i+=1
                j+=1;
        m=max(m,j-i)
        return m


