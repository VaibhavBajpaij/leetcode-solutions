class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        curr=0
        ma=0
        for val in nums:
            if(val==1):
                curr+=1
            else:
                curr=0
            ma=max(ma,curr)
        return ma
        
