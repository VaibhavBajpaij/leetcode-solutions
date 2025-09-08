class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        n=len(nums)
        
        k=0
        for i in range(len(nums)):
            if(nums[k]==0 and nums[i]!=0):
                nums[k],nums[i]=nums[i],nums[k]
                k+=1
            elif(nums[k]!=0):
                k+=1


        
